package com.shuang.black.entity;

public class Authority {
	
	private Integer id;
	private Boolean Login;
	private Boolean update;
	private Boolean delete;
	
	public Authority() {
		super();
	}
	

	public Authority(Integer id, Boolean login, Boolean update, Boolean delete) {
		super();
		this.id = id;
		Login = login;
		this.update = update;
		this.delete = delete;
	}


	public Boolean getLogin() {
		return Login;
	}
	public void setLogin(Boolean login) {
		Login = login;
	}
	public Boolean getUpdate() {
		return update;
	}
	public void setUpdate(Boolean update) {
		this.update = update;
	}
	public Boolean getDelete() {
		return delete;
	}
	public void setDelete(Boolean delete) {
		this.delete = delete;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
