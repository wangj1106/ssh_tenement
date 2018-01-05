package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Complaint;

public interface ComplaintDao {

	int findCount();
	
	List<Complaint> findByPage(int begin, int pageSize);

	void save(Complaint complaint);

	Complaint findById(Integer cid);

	void update(Complaint complaint);

	void delete(Complaint complaint);

	List<Complaint> findAll();

}