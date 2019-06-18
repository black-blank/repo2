package com.shuang.black.service;

import java.util.List;

import com.shuang.black.entity.User;

public interface UserService {
	/**
	 * 	����һ���û�
	 */
	public User findOne(Integer userId);
	
	/**
	 * ���������û�
	 * @return
	 */
	public List<User> findAllUser();
	
	/**
	 * �����û�
	 * @param user
	 */
	public void insert(User user);
	
	/**
	 * �����û�
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * ɾ���û�
	 * @param userId
	 */
	public void delete(Integer userId);
}
