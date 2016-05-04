package com.tianzhu.web.domain.service.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tianzhu.web.domain.model.TUser;

public interface UserService {
	void save(TUser user, String rawPassword);

	TUser findOne(Integer id);

	Page<TUser> findAll(Pageable pageable);

	Page<TUser> findByNameLike(String name, Pageable pageable);

	void delete(TUser user);
}
