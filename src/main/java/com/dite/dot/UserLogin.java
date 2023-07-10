package com.dite.dot;

public class UserLogin {
	private String uid;
	private String upassword;
	
	
	public UserLogin() {
		super();
		
	}

	public UserLogin(String uid, String upassword) {
		super();
		this.uid = uid;
		this.upassword = upassword;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
}
