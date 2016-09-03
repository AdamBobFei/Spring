package hello.dao;

public class ItemDao extends ParentDao{

	private String name;
	 public void getItem(){
		   System.out.println("I have a Item");
	 }
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		 return String.format(
	                "ItemDao[name='%s']",
	                name);
	
	}
	 public ItemDao(String name){
		 this.name=name;
	 }
	 
	 @Override
	public void getName() {
		// TODO Auto-generated method stub
		toString();
	}
}
