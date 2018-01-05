package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.HousesDao;
import com.tenements.domain.Houses;
import com.tenements.domain.PageBean;
import com.tenements.domain.PageBean1;
import com.tenements.domain.User;
import com.tenements.service.HousesService;

@Transactional
public class HousesServiceImpl implements HousesService {
	
	private HousesDao housesDao;

	public void setHousesDao(HousesDao housesDao) {
		this.housesDao = housesDao;
	}

	public List<Houses> findAll() {
		return housesDao.findAll();
	}
	
	public PageBean1<Houses> findByPage(Integer currPage) {
		PageBean1<Houses> pageBean = new PageBean1<Houses>();
		pageBean.setCurrPage(currPage);//封装当前页数
		int pageSize = 20;
		pageBean.setPageSize(pageSize);//封装每页显示记录数
		int totalCount = housesDao.findCount();
		pageBean.setTotalCount(totalCount);//封装总记录数
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());//封装总页数
		int begin = (currPage - 1) * pageSize;
		List<Houses> list = housesDao.findByPage(begin,pageSize);
		pageBean.setList(list);//封装每页显示的数据
		return pageBean;
	}

	public void save(Houses houses) {
		housesDao.save(houses);
	}

	public Houses findById(Integer hid) {
		// TODO Auto-generated method stub
		return housesDao.findById(hid);
	}

	public void update(Houses houses) {
		housesDao.update(houses);
	}

	public void delete(Houses houses) {
		housesDao.delete(houses);
	}

	
}
