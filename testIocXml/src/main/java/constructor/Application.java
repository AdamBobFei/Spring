package constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hello.dao.AccountDao;
import hello.dao.ItemDao;
import hello.interfacetest.PetStoreService;

public class Application {
	

	public static void main(String[] args) {
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[]{"constructor.xml","daos.xml"});

		//从下面这个两个可以看出容器中的出现的实例是单例
		ItemDao itemDao=context.getBean("itemDao", ItemDao.class);
		itemDao.getItem();
		ItemDao itemDao1=context.getBean("itemDao", ItemDao.class);
		itemDao1.getItem();
	
		
		AccountDao accountDao=context.getBean("accountDao", AccountDao.class);
		
		//得到一个接口
		PetStoreService  petStoreService=context.getBean("petStoreConstructor",petstorConstructorImpl.class);
		
		//这里用了合成复用原则,定义父类然后分别用子类去实现其方法,这里为了写的清楚让
		petStoreService.getDaoName(itemDao);
		petStoreService.getDaoName(accountDao);
	}
}
