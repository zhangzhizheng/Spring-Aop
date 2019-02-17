package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.my.demo1.Dao.AccountService;
/**
 * 声明式事务使用：基于切面的
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringTest3 {
	@Autowired
	@Qualifier("accountService")//accountService生成已经是代理对象
	private AccountService accountService;
    @Test
	public void test1(){
		accountService.transfer("zhangsan","wanger",100d);
	}

}
