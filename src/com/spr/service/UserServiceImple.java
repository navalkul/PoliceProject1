package com.spr.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.spr.dao.LoginDao;
import com.spr.dto.User;

@Service
public class UserServiceImple implements UserService {

	@Autowired
	private LoginDao loginDao;
	
	public void setloginDao(LoginDao loginDao)
	{
		this.loginDao=loginDao;
	}
	
	
	
	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		return loginDao.Login(user);
	}

}
