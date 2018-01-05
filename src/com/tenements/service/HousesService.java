package com.tenements.service;

import java.util.List;

import com.tenements.domain.Houses;
import com.tenements.domain.PageBean;
import com.tenements.domain.PageBean1;

public interface HousesService {

	PageBean1<Houses> findByPage(Integer currPage);

	void save(Houses houses);

	Houses findById(Integer hid);

	void update(Houses houses);

	void delete(Houses houses);

	List<Houses> findAll();

}
