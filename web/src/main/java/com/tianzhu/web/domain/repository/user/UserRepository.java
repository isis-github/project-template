package com.tianzhu.web.domain.repository.user;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.web.domain.model.TUser;

public interface UserRepository extends JpaRepository<TUser, Integer> {
    @Query(value = "SELECT x FROM User x WHERE x.name LIKE :name% ORDER BY x.id", countQuery = "SELECT COUNT(x) FROM User x WHERE x.name LIKE :name%")
    Page<TUser> findByNameLike(@Param("name") String name, Pageable page);
}
