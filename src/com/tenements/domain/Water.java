package com.tenements.domain;

public class Water {
	private Integer wid;
	private Integer wyear;
	private Integer wmonth;
	private Integer wquan;
	
	private Houses houses;

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public Integer getWyear() {
		return wyear;
	}

	public void setWyear(Integer wyear) {
		this.wyear = wyear;
	}

	public Integer getWmonth() {
		return wmonth;
	}

	public void setWmonth(Integer wmonth) {
		this.wmonth = wmonth;
	}

	public Integer getWquan() {
		return wquan;
	}

	public void setWquan(Integer wquan) {
		this.wquan = wquan;
	}

	public Houses getHouses() {
		return houses;
	}

	public void setHouses(Houses houses) {
		this.houses = houses;
	}
}
