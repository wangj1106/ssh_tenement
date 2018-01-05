package com.tenements.service;

import java.util.List;

import com.tenements.domain.PageBean1;
import com.tenements.domain.User;

public interface UserService {

	User login(User user);

	List<User> findAll();

	PageBean1<User> findByPage(Integer currPage);

	void save(User user);

	User findById(Integer uid);

	void update(User user);

	void delete(User user);

}
