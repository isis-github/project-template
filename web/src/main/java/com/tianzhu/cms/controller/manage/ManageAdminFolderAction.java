package com.tianzhu.cms.controller.manage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianzhu.cms.domain.exception.ArticleNotFoundException;
import com.tianzhu.cms.domain.exception.FolderNotFoundException;
import com.tianzhu.cms.domain.pojo.JsonVo;

@Controller
@RequestMapping("/manage/adminFolder")
public class ManageAdminFolderAction extends ManageBaseAction {

	/**
	 * 
	 * 进入管理员管理页面
	 * 
	 * @throws FolderNotFoundException
	 */
	@RequestMapping(value = "/manage.htm", method = RequestMethod.GET)
	public String manage(
			@RequestParam(value = "adminId", defaultValue = "1") long adminId,
			ModelMap modelMap) throws FolderNotFoundException {
		/*List<AdminFolderVo> list = new ArrayList<AdminFolderVo>();
		FolderVo folder;
		try {
			list = adminFolderService.getAdminFolderListById(adminId);
			for (AdminFolderVo adminFolder : list) {
				folder = folderService.getFolderById(adminFolder.getFolderId());
				adminFolder.setFolder(folder);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<FolderVo> folderAll = folderService.getAllFolderList(adminId);
		modelMap.put("admin", adminService.getAdminById(adminId));
		modelMap.put("list", list);
		modelMap.put("folderAll", folderAll);
		return "manage/adminFolder/manage";*/
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/addFolder.json", method = RequestMethod.POST)
	public JsonVo<String> addFolder(
			@RequestParam(value = "adminId") long adminId,
			@RequestParam(value = "folderId") long folderId)
			throws ArticleNotFoundException {
		/*JsonVo<String> json = new JsonVo<String>();
		AdminFolderVo adminFolder = adminFolderService.getAdminFolderById(
				adminId, folderId);
		if (adminFolder == null) {
			adminFolderService.addAdminFolder(adminId, folderId);
			json.setResult(true);
		} else {
			json.setMsg("管理员已拥有该权限，请重新添加！");
			json.setResult(false);
		}
		return json;*/
		return null;
	}

	@ResponseBody
	@RequestMapping(value = "/delete.json", method = RequestMethod.POST)
	public JsonVo<String> delete(@RequestParam(value = "adminId") long adminId,
			@RequestParam(value = "folderId") long folderId)
			throws ArticleNotFoundException {
		JsonVo<String> json = new JsonVo<String>();
		adminFolderService.deleteAdminFolder(adminId, folderId);
		json.setResult(true);
		return json;
	}
}
