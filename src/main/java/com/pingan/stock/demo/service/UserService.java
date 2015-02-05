package com.pingan.stock.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
	static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	UserDao userDao;
	
	public List<String> save(String userName) {
		userDao.save(userName);
		List<String> userList = userDao.queryAll();
		userList.add(userName);
		return userList;
	}
	
}