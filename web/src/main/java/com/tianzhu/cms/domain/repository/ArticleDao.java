package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Article;

public interface ArticleDao extends JpaRepository<Article, Long> {

}
