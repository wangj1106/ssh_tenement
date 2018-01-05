package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.UserDao;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	 
	public User login(User user){
		User existUser = userDao.findByUsernameAndPassword(user);
		return existUser;
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public PageBean1<User> findByPage(Integer currPage) {
		PageBean1<User> pageBean = new PageBean1<User>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = userDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<User> list = userDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(User user) {
		userDao.save(user);
	}

	public User findById(Integer uid) {
		return userDao.findById(uid);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}
}
