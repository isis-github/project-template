package com.tianzhu.cms.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.tianzhu.cms.domain.model.entity.AdminFolder;
import com.tianzhu.cms.domain.repository.AdminFolderDao;

@Service
public class AdminFolderService {

	@Autowired
	private AdminFolderDao adminFolderDao;

	@Autowired
	private FolderService folderService;

	@CacheEvict(value = "folder", allEntries = true)
	public AdminFolder addAdminFolder(AdminFolder adminFolder) {
		/*adminFolder.setCreateTime(new Date());
		return adminFolderDao.save(adminFolder);*/
		return null;
	}

	@CacheEvict(value = "folder", allEntries = true)
	public void deleteAdminFolder(Long adminId, Long folderId) {
		// adminFolderDao.deleteAdminFolder(adminId, folderId);
	}

	public List<AdminFolder> getAdminFolderListById(Long adminId) {
		/*List<AdminFolder> list = adminFolderDao
				.getAdminFolderListById(adminId);
		return list;*/
		return null;
	}

	public AdminFolder getAdminFolderById(Long adminId, Long folderId) {
		/*return adminFolderDao.getAdminFolderById(adminId, folderId);*/
		return null;
	}
}
