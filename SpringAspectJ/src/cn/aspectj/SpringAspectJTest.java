package cn.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringAspectJTest {
	@Autowired
	@Qualifier("infoDao")
	private InfoDao infoDao;
	@Test
	public void test(){
		infoDao.add();
		infoDao.find();
		infoDao.delete();
		infoDao.update();
	}
}
