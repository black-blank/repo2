package com.shuang.black.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3363120264501521428L;

	private Integer userId;
	private String userName;
	private Integer userAge;
	private ArrayList<String> interests;
	private Authority authority;
	
	
	public User() {
		super();
	}
	
	



	public User(Integer userId, String userName, Integer userAge,
			ArrayList<String> interests, Authority authority) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.interests = interests;
		this.authority = authority;
	}

	public User(Integer userId, String userName, Integer userAge,
			ArrayList<String> interests) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAge = userAge;
		this.interests = interests;
	}

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public ArrayList<String> getInterests() {
		return interests;
	}
	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}
	
	public Authority getAuthority() {
		return authority;
	}

	public void setAuthority(Authority authority) {
		this.authority = authority;
	}





	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userAge=" + userAge + ", interests="
				+ interests + "]";
	}
	
	
}
