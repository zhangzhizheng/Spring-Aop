package cn.cglib.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 使用CGLIB生成动态代理
 * @author Administrator
 *
 */
public class CgLibProxy implements MethodInterceptor{
	private InfoDao infoDao;

	public CgLibProxy(InfoDao infoDao) {
		super();
		this.infoDao = infoDao;
	}
	public InfoDao createProxy(){
	   /**
		 * 使用CGLIB生成代理：
		 * 1.创建核心类
		 * 2.为其设置父类
		 * 3.设置回调
		 * 4.创建代理
		 */
		//创建核心类
		Enhancer enhancer=new Enhancer();
		//为其设置父类
		enhancer.setSuperclass(infoDao.getClass());
		//设置回调：实现MethodInterceptor接口
		enhancer.setCallback(this);
		//创建代理
		return (InfoDao) enhancer.create();
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		//进行代理设置
		if("update".equals(method.getName())){
			System.out.println("***********CGLIB的日志记录***********");
			Object obj=methodProxy.invokeSuper(proxy, args);
			return obj;
		}
		return methodProxy.invokeSuper(proxy, args);
	}
}
