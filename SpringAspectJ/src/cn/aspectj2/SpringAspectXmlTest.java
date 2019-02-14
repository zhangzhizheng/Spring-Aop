package cn.aspectj2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringAspectXmlTest {
	@Autowired
	@Qualifier("productDao")
	private ProductDao productDao;
	@Test
	public void demoTest(){
		productDao.delete();
		productDao.add();
		productDao.find();
		productDao.update();
	}
}
