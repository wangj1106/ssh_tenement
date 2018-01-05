 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.ElectricDao;
import com.tenements.domain.Electric;

public class ElectricDaoImpl extends HibernateDaoSupport implements ElectricDao{

	public int findCount() {
		String hql = "select count(*) from Electric";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Electric> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Electric.class);
		List<Electric> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Electric electric) {
		this.getHibernateTemplate().save(electric);
	}

	public Electric findById(Integer eid) {
		return this.getHibernateTemplate().get(Electric.class, eid);
	}

	public void update(Electric electric) {
		this.getHibernateTemplate().update(electric);
	}
	
	public  void delete(Electric electric){
		this.getHibernateTemplate().delete(electric);
	}
}