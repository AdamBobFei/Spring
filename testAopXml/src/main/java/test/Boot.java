package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xyz.myapp.service.Idempotent;
import com.xyz.myapp.service.TestService;
import com.xyz.myapp.service.impl.ConcurrentOperationExecutor;



public class Boot {

	public static void main(String[] args) {
		BeanFactory ctx = new ClassPathXmlApplicationContext("aopConfig.xml");
	    
		
		for (int i = 0; i < 100; i++) {
			TestService testService=(TestService) ctx.getBean("testService");
			System.out.println("wulala");
			testService.testAround();
			
			Idempotent idempotent=(Idempotent) ctx.getBean("idempotent");
			idempotent.test();
		}
		
		// foo.getFoo("Pengo", 12);
        
 /*       *//**
         * ²âÊÔbefore
         *//*
        
        FooService foo1 = (FooService) ctx.getBean("fooService");
        System.out.println(foo==foo1);
        
        foo1.testBefore();*/
	}
}
