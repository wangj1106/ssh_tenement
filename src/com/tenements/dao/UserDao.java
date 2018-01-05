package com.tenements.dao;

import java.util.List;

import com.tenements.domain.User;

/**
 *Ա�������dao���
 */
public interface UserDao {
	User findByUsernameAndPassword(User user);

	List<User> findAll();

	int findCount();

	List<User> findByPage(int begin, int pageSize);

	void save(User user);

	User findById(Integer uid);

	void update(User user);

	void delete(User user);
}

