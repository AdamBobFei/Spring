package aspect;


import org.aspectj.lang.JoinPoint;
import org.springframework.aop.AfterAdvice;
import org.springframework.core.Ordered;

public class afterProfiler implements Ordered{

	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}

	public void AfterAdvice(JoinPoint joinpoint){
		System.out.println("后置通知start");
		System.out.println("后置通知end");
	}
}
