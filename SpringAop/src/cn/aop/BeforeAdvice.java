package cn.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 前置增强
 * 要实现MethodBeforeAdvice接口
 * 针对所有方法的增强:(不带有切点的切面)
 * @author Administrator
 *
 */
public class BeforeAdvice implements MethodBeforeAdvice{
	/***
	 * method:执行的方法
	 * args:参数
	 * target:目标对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("******前置增强");
	}

}
