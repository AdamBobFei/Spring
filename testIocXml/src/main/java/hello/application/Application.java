package hello.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hello.dao.AccountDao;
import hello.dao.ItemDao;

public class Application {
	public static void main(String[] args) {
		
		//���Ƿֱ����xml
		/*ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});*/
		//����һ����ϵ�xml
		ApplicationContext context =
			    new ClassPathXmlApplicationContext("combine.xml");

		ItemDao itemDao=context.getBean("itemDao", ItemDao.class);
		itemDao.getItem();
		ItemDao itemDao1=context.getBean("itemDao", ItemDao.class);
		itemDao1.getItem();
		
		AccountDao accountDao=context.getBean("accountDao", AccountDao.class);
		accountDao.getAccount();
	}
	

}
