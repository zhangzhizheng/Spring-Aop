package cn.aspectj2;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * 使用xml的方式
 * @author Administrator
 *
 */
public class MyAspectXml {
	public void before(){
		System.out.println("*******前置通知");
	}
	/**
	 * 设置返回值
	 * @param returnValue
	 */
	public void afterReturning(Object returnValue){
		System.out.println("后置通知*******"+"返回值："+returnValue);
	}
	/**
	 * 环绕通知
	 * 通过 proceedingJoinPoint放行
	 * @param proceedingJoinPoint
	 * @throws Throwable
	 */
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("***环绕前增强****");
		Object result=proceedingJoinPoint.proceed();
		System.out.println("***环绕后增强****");
	}
	
}
