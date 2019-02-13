package cn.aop2;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 增强的类（使用的是环绕增强）
 * @author Administrator
 *
 */
public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("****环绕前增强");
		Object result=methodInvocation.proceed();//执行目标对象的方法;proceed()表示放行
		System.out.println("****环绕后增强");
		return result;
	}
}
