package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.UserDao;
import com.tenements.domain.Houses;
import com.tenements.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	public User findByUsernameAndPassword(User user){
		String hql = "from User where username = ? and password = ?";
		List<User> list = this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public List<User> findAll() {
		return this.getHibernateTemplate().find("from User");
	}

	public int findCount() {
		String hql = "select count(*) from User";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<User> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
		List<User> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	public User findById(Integer uid) {
		return this.getHibernateTemplate().get(User.class, uid);
	}

	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}

	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
	}
}
