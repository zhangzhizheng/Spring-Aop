package cn.defaulter.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.aop.CustomerDao;
import cn.aop2.OrderDao;
/**
 * 自动代理通过DefaultAdvisorAutoProxyCreator
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringTest {
	@Autowired
	@Qualifier("customerDao")//自动代理注入目标对象
	private CustomerDao customerDao;
	@Autowired
	@Qualifier("orderDao")
	private OrderDao orderDao;
	@Test
	public void test(){
		customerDao.add();
		customerDao.find();
		System.out.println("*******************");
		orderDao.add();
	}
}
