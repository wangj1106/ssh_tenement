package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.ElectricDao;
import com.tenements.domain.Electric;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.ElectricService;

@Transactional
public class ElectricServiceImpl implements ElectricService {
	
	private ElectricDao electricDao;
	
	public void setElectricDao(ElectricDao electricDao) {
		this.electricDao = electricDao;
	}

	public PageBean1<Electric> findByPage(Integer currPage) {
		PageBean1<Electric> pageBean = new PageBean1<Electric>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = electricDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<Electric> list = electricDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Electric electric) {
		electricDao.save(electric);
	}

	public Electric findById(Integer rid) {
		return electricDao.findById(rid);
	}

	public void update(Electric electric) {
		electricDao.update(electric);
	}

	public void delete(Electric electric) {
		electricDao.delete(electric);
	}
	
}