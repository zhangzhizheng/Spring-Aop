package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.my.demo1.Dao.AccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class SpringTest2 {
	@Autowired
//	@Qualifier("accountService")
	//因为声明式事务创建了业务层代理对象，要注入代理对象
	@Qualifier("accountServiceProxy")
	private AccountService accountService;
    @Test
	public void test1(){
		accountService.transfer("zhangsan","wanger",100d);
	}

}
