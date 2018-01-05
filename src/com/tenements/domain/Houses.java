package com.tenements.domain;

import java.util.HashSet;
import java.util.Set;

/*
 * 房产实体
 */

public class Houses {
	private Integer hid;
	private String hname;
	private Integer harea;
	
	private User user;
	
	private Set<Water> water = new HashSet<Water>();
	private Set<Electric> electric = new HashSet<Electric>();

	public Integer getHid() {
		return hid;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public Integer getHarea() {
		return harea;
	}

	public void setHarea(Integer harea) {
		this.harea = harea;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Water> getWater() {
		return water;
	}

	public void setWater(Set<Water> water) {
		this.water = water;
	}

	public Set<Electric> getElectric() {
		return electric;
	}

	public void setElectric(Set<Electric> electric) {
		this.electric = electric;
	}
}
