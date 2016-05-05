package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.cms.domain.model.entity.Config;

public interface ConfigDao extends JpaRepository<Config, Long> {
	
	@Query(value="SELECT c FROM Config c where c.key = :key")
	public Config getConfigByKey(@Param("key") String key);

}
