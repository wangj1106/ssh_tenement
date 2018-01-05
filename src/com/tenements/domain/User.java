package com.tenements.domain;

import java.util.HashSet;
import java.util.Set;

public class User {
	private Integer uid;
	private String uname;
	private String username;
	private String password;
	
	private Set<Houses> houses = new HashSet<Houses>();
	private Set<Complaint> complaint = new HashSet<Complaint>();
	private Set<Repair> repair = new HashSet<Repair>();

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Houses> getHouses() {
		return houses;
	}

	public void setHouses(Set<Houses> houses) {
		this.houses = houses;
	}

	public Set<Complaint> getComplaint() {
		return complaint;
	}

	public void setComplaint(Set<Complaint> complaint) {
		this.complaint = complaint;
	}

	public Set<Repair> getRepair() {
		return repair;
	}

	public void setRepair(Set<Repair> repair) {
		this.repair = repair;
	}
}
