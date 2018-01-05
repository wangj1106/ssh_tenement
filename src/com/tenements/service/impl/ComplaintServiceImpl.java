package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.ComplaintDao;
import com.tenements.domain.Complaint;
import com.tenements.domain.PageBean1;
import com.tenements.service.ComplaintService;

@Transactional
public class ComplaintServiceImpl implements ComplaintService {
	
	private ComplaintDao complaintDao;

	public void setComplaintDao(ComplaintDao complaintDao) {
		this.complaintDao = complaintDao;
	}

	public List<Complaint> findAll() {
		return complaintDao.findAll();
	}
	
	public PageBean1<Complaint> findByPage(Integer currPage) {
		PageBean1<Complaint> pageBean = new PageBean1<Complaint>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = complaintDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<Complaint> list = complaintDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Complaint complaint) {
		complaintDao.save(complaint);
	}

	public Complaint findById(Integer cid) {
		// TODO Auto-generated method stub
		return complaintDao.findById(cid);
	}

	public void update(Complaint complaint) {
		complaintDao.update(complaint);
	}

	public void delete(Complaint complaint) {
		complaintDao.delete(complaint);
	}

	
}

