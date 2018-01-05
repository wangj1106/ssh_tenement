package com.tenements.service;

import com.tenements.domain.Admin;
import com.tenements.domain.Fee;
import com.tenements.domain.PageBean1;

public interface FeeService {

	PageBean1<Fee> findByPage(Integer currPage);

	void save(Fee fee);

	Fee findById(Integer fid);

	void update(Fee fee);

	Fee getFee();
}