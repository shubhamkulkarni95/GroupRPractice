package org.UpcastingDowncasting;

class A{
	public void test1(){
		System.out.println("Test1");
	}
}
class B extends A{
	public void test2(){
		System.out.println("Hello Test2");
	}
}
class C extends B{
	public void test3() {
		System.out.println("Hello Test3");
	}
}
public class UpcastingEx1 extends C{

	public static void main(String[] args) {
		C obj=new C();
		obj.test1();
		obj.test2();
		obj.test3();
		
		B obj1=new C();
		obj1.test1();
		obj1.test2();
	//	obj1.test3();  //it shows error
		
		
		A obj2=new C();
		obj2.test1();
		

	}

}
