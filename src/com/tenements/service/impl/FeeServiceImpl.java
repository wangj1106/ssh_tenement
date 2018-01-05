package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.FeeDao;
import com.tenements.domain.Admin;
import com.tenements.domain.Fee;
import com.tenements.domain.PageBean1;
import com.tenements.service.FeeService;

@Transactional
public class FeeServiceImpl implements FeeService {
	
	private FeeDao feeDao;
	
	public void setFeeDao(FeeDao feeDao) {
		this.feeDao = feeDao;
	}

	public PageBean1<Fee> findByPage(Integer currPage) {
		PageBean1<Fee> pageBean = new PageBean1<Fee>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = feeDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<Fee> list = feeDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Fee fee) {
		feeDao.save(fee);
	}

	public Fee findById(Integer fid) {
		return feeDao.findById(fid);
	}

	public void update(Fee fee) {
		feeDao.update(fee);
	}

	@Override
	public Fee getFee() {
		Fee existFee = feeDao.findFee();
		return existFee;
	}

}