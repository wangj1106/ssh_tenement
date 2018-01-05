 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.HousesDao;
import com.tenements.domain.Houses;
import com.tenements.domain.User;

public class HousesDaoImpl extends HibernateDaoSupport implements HousesDao{

	public int findCount() {
		String hql = "select count(*) from Houses";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Houses> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Houses.class);
		List<Houses> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Houses houses) {
		this.getHibernateTemplate().save(houses);
	}

	public Houses findById(Integer hid) {
		return this.getHibernateTemplate().get(Houses.class, hid);
	}

	public void update(Houses houses) {
		this.getHibernateTemplate().update(houses);
	}
	
	public  void delete(Houses houses){
		this.getHibernateTemplate().delete(houses);
	}

	public List<Houses> findAll() {
		return this.getHibernateTemplate().find("from Houses");
	}


}
