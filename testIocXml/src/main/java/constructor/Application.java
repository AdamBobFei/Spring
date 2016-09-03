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

		//����������������Կ��������еĳ��ֵ�ʵ���ǵ���
		ItemDao itemDao=context.getBean("itemDao", ItemDao.class);
		itemDao.getItem();
		ItemDao itemDao1=context.getBean("itemDao", ItemDao.class);
		itemDao1.getItem();
	
		
		AccountDao accountDao=context.getBean("accountDao", AccountDao.class);
		
		//�õ�һ���ӿ�
		PetStoreService  petStoreService=context.getBean("petStoreConstructor",petstorConstructorImpl.class);
		
		//�������˺ϳɸ���ԭ��,���常��Ȼ��ֱ�������ȥʵ���䷽��,����Ϊ��д�������
		petStoreService.getDaoName(itemDao);
		petStoreService.getDaoName(accountDao);
	}
}
