package com.tianzhu.cms.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.cms.domain.model.entity.Folder;

public interface FolderDao extends JpaRepository<Folder, Long> {
	
	
	@Query(value="SELECT f FROM Folder f where f.folderId = :folderId")
	public Folder getFolderById(@Param("folderId") Long folderId);
	
	
	@Query(value="SELECT f FROM Folder f where f.ename = :ename")
	public Folder getFolderByEname(@Param("ename") String ename);
	
	
	@Query(value="SELECT f FROM Folder f where f.folderId = :folderId and f.status = :status order by f.sort")
	public List<Folder> getFolderListByFatherId(@Param("folderId") Long fatherId, @Param("status") int status);

}
