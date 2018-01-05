package com.tenements.service;

import com.tenements.domain.Electric;
import com.tenements.domain.PageBean1;

public interface ElectricService {

	PageBean1<Electric> findByPage(Integer currPage);

	void save(Electric electric);

	Electric findById(Integer eid);

	void update(Electric electric);

	void delete(Electric electric);

}
