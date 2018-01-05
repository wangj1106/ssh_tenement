package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Electric;

public interface ElectricDao {

	int findCount();
	
	List<Electric> findByPage(int begin, int pageSize);

	void save(Electric electric);

	Electric findById(Integer rid);

	void update(Electric electric);

	void delete(Electric electric);

}
