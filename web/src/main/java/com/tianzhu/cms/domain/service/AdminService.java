/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.tianzhu.cms.domain.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tianzhu.cms.domain.constant.SystemConstant;
import com.tianzhu.cms.domain.exception.AuthException;
import com.tianzhu.cms.domain.model.entity.Admin;
import com.tianzhu.cms.domain.repository.AdminDao;
import com.tianzhu.cms.util.AuthUtils;
import com.tianzhu.cms.util.PropertyUtils;

/**
 * 管理员
 * 
 * @author Administrator
 * 
 */
@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;

	// ///////////////////////////////
	// ///// 增加 ////////
	// ///////////////////////////////

	/**
	 * 添加管理员
	 * 
	 * @param email
	 * @param name
	 * @param password
	 * @return Admin
	 */
	public Admin save(Admin admin)
			throws AuthException {
		Date now = new Date();
		admin.setPassword(AuthUtils.getPassword(admin.getPassword()));
		admin.setCreateTime(now);
		return adminDao.save(admin);
		//return null;
	}

	// ///////////////////////////////
	// ///// 刪除 ////////
	// ///////////////////////////////

	/**
	 * 删除管理员
	 * 
	 * @param adminId
	 * @return Integer
	 */
	public void deleteAdmin(Long adminId) {
		adminDao.delete(adminId);
	}

	// ///////////////////////////////
	// ///// 修改 ////////
	// ///////////////////////////////

	/**
	 * 修改管理员资料
	 * 
	 * @param adminId
	 * @param name
	 * @param password
	 * @param status
	 * @return Admin
	 * @throws AuthException
	 */

	public void updateAdminByAmdinId(Long adminId, String password)
			throws AuthException {
		String pwd = AuthUtils.getPassword(password);
		Admin ad = adminDao.findOne(adminId);
		ad.setPassword(pwd);
		adminDao.save(ad);
	}

	// ///////////////////////////////
	// ///// 查詢 ////////
	// ///////////////////////////////

	/**
	 * 管理员登陆
	 * 
	 * @param email
	 * @param password
	 * @param request
	 * @throws IOException
	 */
	public void adminLogin(String name, String password,
			HttpServletRequest request) throws AuthException,
			IOException {
		Admin admin = adminDao.getAdminByName(name);
		if (admin == null) {
			throw new AuthException("邮箱或密码错误");
		}
		String loginPassword = AuthUtils.getPassword(password);
		if (loginPassword.equals(admin.getPassword())) {
			HttpSession session = request.getSession();
			admin.setPassword("");
			if (name.equals(PropertyUtils
					.getValue("shishuocms.admin"))) {
				//admin.setAdmin(true);
			} else {
				//admin.setAdmin(false);
			}
			session.setAttribute(SystemConstant.SESSION_ADMIN,
					admin);
		} else {
			throw new AuthException("邮箱或密码错误");
		}
	}

	/**
	 * 通过Id获得指定管理员资料
	 */
	public Admin getAdminById(Long adminId) {
		//return adminDao.getAdminById(adminId);
		return adminDao.findOne(adminId);
	}

	/**
	 * 获得所有管理员的分页数据
	 * 
	 * @param offset
	 * @param rows
	 * @return List<Admin>
	 */
	public List<Admin> getAllList(int offset, int rows) {
		Pageable pageable = new PageRequest(offset, rows);
		return adminDao.findAll(pageable).getContent();
		//return adminDao.getAllList(offset, rows);
		//return null;
	}

	/**
	 * 获得所有管理员的数量
	 * 
	 * @return Integer
	 */
	public long getAllListCount() {
		//return adminDao.getAllListCount();
		return adminDao.count();
		//return 0;
	}

	/**
	 * 获得所有管理员的分页
	 * 
	 * @param Integer
	 * @return PageVo<Admin>
	 */
	public Admin getAllListPage(int pageNum) {
		/*PageVo<Admin> pageVo = new PageVo<Admin>(pageNum);
		pageVo.setRows(20);
		List<Admin> list = this.getAllList(pageVo.getOffset(),
				pageVo.getRows());
		pageVo.setList(list);
		pageVo.setCount(this.getAllListCount());
		return pageVo;*/
		return null;
	}

	/**
	 * 通过email获得管理员资料
	 * 
	 * @param email
	 * @return Admin
	 */
	public Admin getAdminByName(String name) {
		return adminDao.getAdminByName(name);
		//return null;
	}

	public Long getSuperAdminId() {
		Admin admin = getAdminByName(PropertyUtils
				.getValue("shishuocms.admin"));
		return admin.getAdminId();
		//return null;
	}
}
