package com.tianzhu.cms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianzhu.cms.domain.model.entity.Guestbook;

public interface GuestbookDao extends JpaRepository<Guestbook, Long> {

}
