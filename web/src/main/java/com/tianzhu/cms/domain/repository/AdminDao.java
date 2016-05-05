package com.tianzhu.cms.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.cms.domain.model.entity.Admin;


public interface AdminDao extends JpaRepository<Admin, Long> {
	
	@Query(value="SELECT ad FROM Admin ad where ad.name = :name")
	public Admin getAdminByName(@Param("name") String name);
	
}
