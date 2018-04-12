package com.cheen.pojo;

public class User {
	private String uname;
	private String upassword;
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public User(String uname, String upassword) {
		super();
		this.uname = uname;
		this.upassword = upassword;
	}


	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	
	
}
