package com.tenements.dao;

import com.tenements.domain.Admin;

public interface AdminDao {

	Admin findByUsernameAndPassword(Admin admin);

}
