package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Long> {

}
