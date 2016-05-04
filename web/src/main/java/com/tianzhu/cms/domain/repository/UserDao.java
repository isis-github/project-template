package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

}
