package com.sp.service;

import com.sp.pojo.User;

public interface BaseService {
	public boolean login(String username, String password);

	 public String registration(User user);

}
