package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Media;

public interface MediaDao extends JpaRepository<Media, Long> {

}
