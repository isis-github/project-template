package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Folder;

public interface FolderDao extends JpaRepository<Folder, Long> {

}
