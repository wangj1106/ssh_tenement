package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Houses;

public interface HousesDao {

	int findCount();
	
	List<Houses> findByPage(int begin, int pageSize);

	void save(Houses houses);

	Houses findById(Integer hid);

	void update(Houses houses);

	void delete(Houses houses);

	List<Houses> findAll();

}
