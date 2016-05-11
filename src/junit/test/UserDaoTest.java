package junit.test;

import java.util.Date;

import org.junit.Test;

import cn.xing.dao.UserDao;
import cn.xing.dao.impl.UserDaoImpl;
import cn.xing.domain.User;

public class UserDaoTest {
	@Test
	public void testAdd() {
		User user = new User();
		user.setBirthday(new Date());
		user.setEmail("bb@sina.com");
		user.setId("232533");
		user.setNickname("Àî×Ó");
		user.setPassword("123");
		user.setUsername("bbb");
		UserDao dao = new UserDaoImpl();
		dao.add(user);
	}
	@Test
	public void testFind(){
		UserDao dao = new UserDaoImpl();
//		User user = dao.find("bbb","123");
//		System.out.println(user);
		System.out.println(dao.find("bb"));
	}
	

}
