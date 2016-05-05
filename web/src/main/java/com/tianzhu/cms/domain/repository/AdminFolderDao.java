package com.tianzhu.cms.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.cms.domain.model.entity.AdminFolder;

public interface AdminFolderDao extends JpaRepository<AdminFolder, Long> {
	
	@Query(value="SELECT af FROM AdminFolder af where af.adminId = :adminId and af.folderId=:folderId")
	public AdminFolder findAdminFolder(@Param("adminId") Long adminId, @Param("folderId") Long folderId);
	
	
	@Query(value="SELECT af FROM AdminFolder af where af.adminId = :adminId")
	public List<AdminFolder> getAdminFolderListById(@Param("adminId") Long adminId);

}
