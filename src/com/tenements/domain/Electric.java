package com.tenements.domain;

public class Electric {
	private Integer eid;
	private Integer eyear;
	private Integer emonth;
	private Integer equan;
	
	private Houses houses;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Integer getEyear() {
		return eyear;
	}

	public void setEyear(Integer eyear) {
		this.eyear = eyear;
	}

	public Integer getEmonth() {
		return emonth;
	}

	public void setEmonth(Integer emonth) {
		this.emonth = emonth;
	}

	public Integer getEquan() {
		return equan;
	}

	public void setEquan(Integer equan) {
		this.equan = equan;
	}

	public Houses getHouses() {
		return houses;
	}

	public void setHouses(Houses houses) {
		this.houses = houses;
	}
}
