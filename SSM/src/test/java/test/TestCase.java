package test;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shuang.black.entity.User;
import com.shuang.black.service.UserService;
import com.shuang.black.service.UserServiceImpl;


public class TestCase {
	ClassPathXmlApplicationContext ac = null;
	UserService service = null;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		service = (UserServiceImpl) ac.getBean("userServiceImpl");
	}
	
	@Test
	public void jdbc(){
		BasicDataSource dataSource = (BasicDataSource) ac.getBean("dataSource");
		System.out.println(dataSource);
	}
	
	@Test
	public void test(){
		String[] aa = {"a","s"};
		User user = new User(2,"hello",24,aa);
		service.insert(user);
	}
	@Test
	public void test1(){
		System.out.println(service.findOne(1));
	}
	@Test
	public void test2(){
		System.out.println(service.findAllUser().size());
	}
	@Test
	public void test3(){
		service.delete(1);
	}
	@Test
	public void test4(){
		User user = new User(1,"hello",25);
		service.update(user);
	}
	
	
}
