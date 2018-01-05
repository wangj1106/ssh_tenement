package com.tenements.service;

import java.util.List;

import com.tenements.domain.Complaint;
import com.tenements.domain.PageBean1;

public interface ComplaintService {

	PageBean1<Complaint> findByPage(Integer currPage);

	void save(Complaint complaint);

	Complaint findById(Integer cid);

	void update(Complaint complaint);

	void delete(Complaint complaint);

	List<Complaint> findAll();

}