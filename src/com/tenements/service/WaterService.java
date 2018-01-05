package com.tenements.service;

import com.tenements.domain.PageBean1;
import com.tenements.domain.Water;

public interface WaterService {

	PageBean1<Water> findByPage(Integer currPage);

	void save(Water water);

	Water findById(Integer wid);

	void update(Water water);

	void delete(Water water);

}
