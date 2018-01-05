package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Water;

public interface WaterDao {

	int findCount();
	
	List<Water> findByPage(int begin, int pageSize);

	void save(Water water);

	Water findById(Integer wid);

	void update(Water water);

	void delete(Water water);

}
