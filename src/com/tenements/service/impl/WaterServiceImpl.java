package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.WaterDao;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.domain.Water;
import com.tenements.service.WaterService;

@Transactional
public class WaterServiceImpl implements WaterService {
	
	private WaterDao waterDao;
	
	public void setWaterDao(WaterDao waterDao) {
		this.waterDao = waterDao;
	}

	public PageBean1<Water> findByPage(Integer currPage) {
		PageBean1<Water> pageBean = new PageBean1<Water>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = waterDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<Water> list = waterDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Water water) {
		waterDao.save(water);
	}

	public Water findById(Integer wid) {
		return waterDao.findById(wid);
	}

	public void update(Water water) {
		waterDao.update(water);
	}

	public void delete(Water water) {
		waterDao.delete(water);
	}
	
}