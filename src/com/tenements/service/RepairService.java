package com.tenements.service;

import java.util.List;

import com.tenements.domain.Repair;
import com.tenements.domain.PageBean1;

public interface RepairService {

	PageBean1<Repair> findByPage(Integer currPage);

	void save(Repair repair);

	Repair findById(Integer rid);

	void update(Repair repair);

	void delete(Repair repair);

	List<Repair> findAll();

}