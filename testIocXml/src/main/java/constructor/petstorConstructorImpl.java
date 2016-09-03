package constructor;

import hello.dao.AccountDao;
import hello.dao.ItemDao;
import hello.dao.ParentDao;
import hello.interfacetest.PetStoreService;

public class petstorConstructorImpl implements PetStoreService{

	private  AccountDao accountDao;
	private ItemDao itemDao;
	
	@Override
	public void getDaoName(ParentDao parentDao) {
		// TODO Auto-generated method stub
		System.out.println(parentDao.toString());
	}
	
	public petstorConstructorImpl(AccountDao accountDao,ItemDao itemDao){
		this.accountDao=accountDao;
		this.itemDao=itemDao;
	}

	
}
