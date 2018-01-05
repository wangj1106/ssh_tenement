 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.FeeDao;
import com.tenements.domain.Admin;
import com.tenements.domain.Fee;

public class FeeDaoImpl extends HibernateDaoSupport implements FeeDao{

	public int findCount() {
		String hql = "select count(*) from Fee";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Fee> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Fee.class);
		List<Fee> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Fee fee) {
		this.getHibernateTemplate().save(fee);
	}

	public Fee findById(Integer hid) {
		return this.getHibernateTemplate().get(Fee.class, hid);
	}

	public void update(Fee fee) {
		this.getHibernateTemplate().update(fee);
	}
	
	public List<Fee> findAll() {
		return this.getHibernateTemplate().find("from Fee");
	}

	@Override
	public Fee findFee() {
		List<Fee> list = this.getHibernateTemplate().find("from Fee");
			return list.get(0);
	}


}