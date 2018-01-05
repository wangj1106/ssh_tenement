package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Repair;

public interface RepairDao {

	int findCount();
	
	List<Repair> findByPage(int begin, int pageSize);

	void save(Repair repair);

	Repair findById(Integer rid);

	void update(Repair repair);

	void delete(Repair repair);

	List<Repair> findAll();

}