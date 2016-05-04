package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Config;

public interface ConfigDao extends JpaRepository<Config, Long> {

}
