 package com.tenements.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.tenements.dao.ComplaintDao;
import com.tenements.domain.Complaint;
import com.tenements.domain.User;

public class ComplaintDaoImpl extends HibernateDaoSupport implements ComplaintDao{

	public int findCount() {
		String hql = "select count(*) from Complaint";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if(list.size() > 0){
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Complaint> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Complaint.class);
		List<Complaint> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
		return list;
	}

	public void save(Complaint complaint) {
		this.getHibernateTemplate().save(complaint);
	}

	public Complaint findById(Integer cid) {
		return this.getHibernateTemplate().get(Complaint.class, cid);
	}

	public void update(Complaint complaint) {
		this.getHibernateTemplate().update(complaint);
	}
	
	public  void delete(Complaint complaint){
		this.getHibernateTemplate().delete(complaint);
	}

	public List<Complaint> findAll() {
		return this.getHibernateTemplate().find("from Complaint");
	}


}
