package com.sp.service;

import com.sp.dao.BaseDao;
import com.sp.dao.BaseDaoImpl;
import com.sp.pojo.User;

public class BaseServiceImpl implements BaseService {

 private BaseDao loginDao = new BaseDaoImpl();

 public boolean login(String username, String password) {
  return loginDao.login(username, password);
 }

 public String registration(User user) {
  return loginDao.register(user);
 }

}

