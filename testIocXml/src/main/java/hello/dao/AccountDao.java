package hello.dao;

public class AccountDao extends ParentDao{

   public void getAccount(){
	   System.out.println("I have a account");
   }
   
   private String name;
   
   public AccountDao(String name) {
	// TODO Auto-generated constructor stub
	   this.name=name;
   }
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
	        return String.format(
	                "AccountDao[name='%s']",
	                name);
	}
   
   @Override
	public void getName() {
		// TODO Auto-generated method stub
		toString();
	}
	
}
