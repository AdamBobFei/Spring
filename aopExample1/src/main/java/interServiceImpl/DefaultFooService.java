package interServiceImpl;

import Model.Foo;
import interService.FooService;

public class DefaultFooService implements FooService{

	public Foo getFoo(String fooName, int age) {
		// TODO Auto-generated method stub
		Foo foo1=new Foo();
		foo1.setAge(age);
		foo1.setName(fooName);
		System.out.println("�����ڲ���ʼִ��");
		return foo1;
	}

}
