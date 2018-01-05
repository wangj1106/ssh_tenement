package com.tenements.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.AdminDao;
import com.tenements.domain.Admin;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao {

	public Admin findByUsernameAndPassword(Admin admin) {
		String hql = "from Admin where username = ? and password = ?";
		List<Admin> list = this.getHibernateTemplate().find(hql,admin.getUsername(),admin.getPassword());
		if(list.size() > 0){
			return list.get(0);
		}
		return null;
	}
	
}
