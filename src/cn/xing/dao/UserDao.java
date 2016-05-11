package cn.xing.dao;

import cn.xing.domain.User;

public interface UserDao {

	// 向数据库中添加数据
	void add(User user);

	// 登录时用户判断
	User find(String username, String password);

	// 查找注册的用户是否在数据库中存在
	boolean find(String username);

}