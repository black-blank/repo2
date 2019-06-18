package com.shuang.black.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shuang.black.dao.UserDao;
import com.shuang.black.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	
	@Override
	public User findOne(Integer userId) {
		return dao.findOne(userId);
	}

	@Override
	public List<User> findAllUser() {
		return dao.findAllUser();
	}

	@Override
	public void insert(User user) {
		dao.insert(user);
	}

	@Override
	public void update(User user) {
		dao.update(user);
	}

	@Override
	public void delete(Integer userId) {
		dao.delete(userId);
	}

}
