package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import interService.FooService;

public class Boot {
	public static void main(String[] args) {
		 BeanFactory ctx = new ClassPathXmlApplicationContext("plain.xml");
		 FooService fooService = (FooService) ctx.getBean("fooService");
		 System.out.println("方法开始执行");
	     fooService.getFoo("Pengo", 160);
	     System.out.println("方法开始结束");
	}
}
