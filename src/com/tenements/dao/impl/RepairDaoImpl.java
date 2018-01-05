 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.RepairDao;
import com.tenements.domain.Repair;
import com.tenements.domain.User;

public class RepairDaoImpl extends HibernateDaoSupport implements RepairDao{

	public int findCount() {
		String hql = "select count(*) from Repair";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Repair> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Repair.class);
		List<Repair> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Repair repair) {
		this.getHibernateTemplate().save(repair);
	}

	public Repair findById(Integer rid) {
		return this.getHibernateTemplate().get(Repair.class, rid);
	}

	public void update(Repair repair) {
		this.getHibernateTemplate().update(repair);
	}
	
	public  void delete(Repair repair){
		this.getHibernateTemplate().delete(repair);
	}

	public List<Repair> findAll() {
		return this.getHibernateTemplate().find("from Repair");
	}


}