package com.show.sign.vo;

import java.io.Serializable;

public class User implements Serializable {

	/**
	* @Fields field:field:{todo}(用一句话描述这个变量表示什么)
	*/
	private static final long serialVersionUID = 45121993099188615L;
	
	private String username;
	
	private String password;

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
