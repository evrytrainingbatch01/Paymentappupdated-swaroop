package com.sp.dao;

import com.sp.pojo.User;

public interface BaseDao {
	public boolean login(String username, String password);

	 public String register(User user);

}
