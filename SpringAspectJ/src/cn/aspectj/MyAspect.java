package cn.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 切面类：就是切点与增强的结合
 * //注解的方式通知
 * 如果某个方法多进行通知。比如(value="execution(* cn.aspectj.InfoDao.find(..))")
 * 可以自己定义切点，方便些，用@Pointcut
 * @author Administrator
 *
 */
@Aspect
public class MyAspect {
	
	/**
	 * @Before前置通知
	 * @param joinPoint
	 */
	@Before("execution(* cn.aspectj.InfoDao.add(..))")//某个类的的某个方法进行增强，如果是包下.*是包下的所有;包前的*与包要有空格
	public void before(JoinPoint joinPoint) {
		//joinPoint的值：execution(void cn.aspectj.InfoDao.add())
		System.out.println("*******前置增强"+joinPoint);
	}
	/**
	 * @AfterReturing 后置通知
	 * @param returnValue
	 */
	@AfterReturning(value="execution(* cn.aspectj.InfoDao.find(..))",returning="returnValue")
	public void afterReturning(Object returnValue){
		//返回值是增强方法的返回值
		System.out.println("后置增强*******"+"返回值："+returnValue);
	}
	/**
	 * @Around 环绕通知
	 * @param proceedingJoinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around(value="execution(* cn.aspectj.InfoDao.delete(..))")
	public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("****环绕前增强");
        //如果不调用 ProceedingJoinPoint的 proceed方法，那么目标方法就被拦截了
		Object returnValueObject=proceedingJoinPoint.proceed();
		System.out.println("环绕后增强*****");
		return returnValueObject;
	}
	/**
	 * @AfterThrowing 抛出通知
	 * @param e
	 */
	@AfterThrowing(value="execution(* cn.aspectj.InfoDao.update(..))",throwing="e")
	//两个e变量保持一致
	public void Afterthrow(Throwable e){
		//不出现异常，不会输出
		System.out.println("出现异常！！！"+"异常信息"+e.getMessage());
	}
	/**
	 *@After 最终通知
	 */
	@After(value="execution(* cn.aspectj.InfoDao.update(..))")
	public void after(){
		System.out.println("最终通知！！！----无论是否出现异常都会执行！");
	}
}
