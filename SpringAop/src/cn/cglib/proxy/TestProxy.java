package cn.cglib.proxy;

import org.junit.Test;

public class TestProxy {
	//传统方式
	@Test
	public void test1(){
		InfoDao infoDao=new InfoDao();
		infoDao.add();
		infoDao.update();
		
	}
	//cglib代理
	@Test
	public void test2(){
		InfoDao infoDao=new InfoDao();
		InfoDao proxy=new CgLibProxy(infoDao).createProxy();
		proxy.add();
		proxy.update();
	}
}
