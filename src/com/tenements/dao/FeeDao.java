package com.tenements.dao;

import java.util.List;

import com.tenements.domain.Fee;
import com.tenements.domain.Houses;

public interface FeeDao {

	int findCount();
	
	List<Fee> findByPage(int begin, int pageSize);

	void save(Fee fee);

	Fee findById(Integer fid);

	void update(Fee fee);

	Fee findFee();

}
