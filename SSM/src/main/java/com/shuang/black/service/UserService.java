package com.shuang.black.service;

import java.util.List;

import com.shuang.black.entity.User;

public interface UserService {
	/**
	 * 	查找一名用户
	 */
	public User findOne(Integer userId);
	
	/**
	 * 查找所有用户
	 * @return
	 */
	public List<User> findAllUser();
	
	/**
	 * 新增用户
	 * @param user
	 */
	public void insert(User user);
	
	/**
	 * 更新用户
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * 删除用户
	 * @param userId
	 */
	public void delete(Integer userId);
}
