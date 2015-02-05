package com.pingan.stock.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	static Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	public void save(String userName) {
		logger.debug("TODO: This method(save) is under development.");
	}

	public List<String> queryAll() {
		logger.debug("TODO: This method(queryAll) is under development.");
		return new ArrayList<String>();
	}
}