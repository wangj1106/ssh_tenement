 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.WaterDao;
import com.tenements.domain.Water;

public class WaterDaoImpl extends HibernateDaoSupport implements WaterDao{

	public int findCount() {
		String hql = "select count(*) from Water";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Water> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Water.class);
		List<Water> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Water water) {
		this.getHibernateTemplate().save(water);
	}

	public Water findById(Integer wid) {
		return this.getHibernateTemplate().get(Water.class, wid);
	}

	public void update(Water water) {
		this.getHibernateTemplate().update(water);
	}
	
	public  void delete(Water water){
		this.getHibernateTemplate().delete(water);
	}
}
