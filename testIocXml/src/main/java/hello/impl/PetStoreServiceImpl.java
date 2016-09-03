package hello.impl;

import hello.dao.AccountDao;
import hello.dao.ItemDao;
import hello.dao.ParentDao;
import hello.interfacetest.PetStoreService;


public class PetStoreServiceImpl implements PetStoreService{
	
  private AccountDao accountDao;
  private ItemDao itemDao;
  public AccountDao getAccountDao() {
		return accountDao;
  }
  public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
  }
  public ItemDao getItemDao() {
		return itemDao;
  }
  public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
  }
	
	@Override
	public void getDaoName(ParentDao parentDao) {
		// TODO Auto-generated method stub
		
	}
  
  

}
