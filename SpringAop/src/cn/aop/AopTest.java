package cn.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
	//注入 CustomerDao
	
	@Autowired
	//@Qualifier("customerDao")//要与spring的xml文件bean的id一样；此处注入的是真实对象，要注入代理对象，实现配置代理
	@Qualifier("customerDaoProxy")//注入的时候要注入代理对象
	private CustomerDao customerDao;
	@Test
	public void test1(){
		customerDao.add();
		customerDao.update();
		customerDao.delete();
		customerDao.find();
	}
}
