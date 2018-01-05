package com.tenements.service.impl;

import com.tenements.dao.AdminDao;
import com.tenements.domain.Admin;
import com.tenements.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public Admin login(Admin admin) {
		Admin existAdmin = adminDao.findByUsernameAndPassword(admin);
		return existAdmin;
	}
	
	
}
