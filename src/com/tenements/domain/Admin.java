package com.tenements.domain;

public class Admin {
	private Integer Aid;
	private String username;
	private String password;
	
	public Integer getAid() {
		return Aid;
	}
	public void setAid(Integer aid) {
		Aid = aid;
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
}
