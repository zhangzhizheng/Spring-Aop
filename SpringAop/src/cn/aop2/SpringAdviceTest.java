package cn.aop2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAdviceTest {
	@Autowired
	@Qualifier("orderDaoProxy")
	private OrderDao orderDao;
	
	@Test
	public void test1(){
		orderDao.add();
		orderDao.delete();
		orderDao.find();
		orderDao.update();
	}
}
