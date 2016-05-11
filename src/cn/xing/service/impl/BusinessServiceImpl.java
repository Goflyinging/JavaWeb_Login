package cn.xing.service.impl;

import cn.xing.dao.UserDao;
import cn.xing.dao.impl.UserDaoImpl;
import cn.xing.domain.User;
import cn.xing.exception.UserExistException;
import cn.xing.utils.ServiceUtils;

//对web层提供所有的业务服务
public class BusinessServiceImpl {

	private UserDao dao = new UserDaoImpl();  //工厂模式  spring
	//对web层提供注册服务
	public void register(User user) throws UserExistException {
		//判断当前要注册的用户师傅存在
		boolean b=dao.find(user.getUsername());
		if(b){
			throw new UserExistException("用户已经存在!");
			//用户存在，给web层抛出编译时异常
		}else{
			user.setPassword(ServiceUtils.md5(user.getPassword()));
			dao.add(user);
		}
 
		
	}
	//对web层提供登陆服务
	public User login(String username,String password){
		 password = ServiceUtils.md5(password);
		 return dao.find(username, password);
	}
}
