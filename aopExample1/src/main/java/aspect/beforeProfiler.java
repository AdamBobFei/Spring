package aspect;

import java.util.Iterator;

import org.aspectj.lang.JoinPoint;
import org.springframework.core.Ordered;

public class beforeProfiler implements Ordered{

	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	public void beforeAdvice(JoinPoint joinPoint){
		System.out.println("前置通知start");
		try {
			Object[] objects=joinPoint.getArgs();
			for (Object object : objects) {
				System.out.println(object);
			}
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("前置通知End");
		}
		
	}
	

}
