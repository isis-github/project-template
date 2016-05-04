package com.tianzhu.web.domain.service.user;

import java.util.Date;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianzhu.web.controller.HomeController;
import com.tianzhu.web.domain.common.exception.ResourceNotFoundException;
import com.tianzhu.web.domain.model.TUser;
import com.tianzhu.web.domain.repository.user.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Inject
    protected UserRepository userRepository;

    @Inject
    protected PasswordEncoder passwordEncoder;

    @Override
    public void save(TUser user, String rawPassword) {
        String password = passwordEncoder.encode(rawPassword);
        user.setPassword(password);

        Date now = new DateTime().toDate();
        if (user.getCreatedAt() == null) {
            user.setCreatedAt(now);
        }

        user.setUpdatedAt(now);
        userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    @Cacheable(value="default",key="#id.toString()")
    public TUser findOne(Integer id) {
        TUser user = userRepository.findOne(id);
        if (user == null) {
            throw new ResourceNotFoundException("User [id=" + id
                    + "] is not found.");
        }
        
        logger.info("cache is missing !!");
        return user;
        
        
    }

    @Override
    @Transactional(readOnly = true)
    public Page<TUser> findAll(Pageable pageable) {
        Page<TUser> page = userRepository.findAll(pageable);
        return page;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<TUser> findByNameLike(String name, Pageable pageable) {
        String query = name; // TODO escape
        Page<TUser> page = userRepository.findByNameLike(query, pageable);
        return page;
    }

    @Override
    public void delete(TUser user) {
        userRepository.delete(user);
    }

}
