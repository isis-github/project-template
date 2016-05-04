package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Headline;

public interface HeadlineDao extends JpaRepository<Headline, Long> {

}
