package com.tenements.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tenements.dao.RepairDao;
import com.tenements.domain.Repair;
import com.tenements.domain.PageBean1;
import com.tenements.service.RepairService;

@Transactional
public class RepairServiceImpl implements RepairService {
	
	private RepairDao repairDao;

	public void setRepairDao(RepairDao repairDao) {
		this.repairDao = repairDao;
	}

	public List<Repair> findAll() {
		return repairDao.findAll();
	}
	
	public PageBean1<Repair> findByPage(Integer currPage) {
		PageBean1<Repair> pageBean = new PageBean1<Repair>();
		pageBean.setCurrPage(currPage);
		int pageSize = 20;
		pageBean.setPageSize(pageSize);
		int totalCount = repairDao.findCount();
		pageBean.setTotalCount(totalCount);
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		int begin = (currPage - 1) * pageSize;
		List<Repair> list = repairDao.findByPage(begin,pageSize);
		pageBean.setList(list);
		return pageBean;
	}

	public void save(Repair repair) {
		repairDao.save(repair);
	}

	public Repair findById(Integer cid) {
		// TODO Auto-generated method stub
		return repairDao.findById(cid);
	}

	public void update(Repair repair) {
		repairDao.update(repair);
	}

	public void delete(Repair repair) {
		repairDao.delete(repair);
	}

	
}

