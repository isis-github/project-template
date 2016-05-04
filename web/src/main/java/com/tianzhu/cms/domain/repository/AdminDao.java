package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Admin;


public interface AdminDao extends JpaRepository<Admin, Long> {

}
