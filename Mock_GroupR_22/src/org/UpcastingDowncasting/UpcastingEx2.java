package org.UpcastingDowncasting;

class A1{
	public void test1(){
		System.out.println("Test1");
		System.out.println("A1");
	}
}
class B1 extends A1{
	public void test1(){
		System.out.println("Hello Test2");
		System.out.println("B1");
	}
}
class C1 extends B1{
	public void test1() {
		System.out.println("Hello Test3");
		System.out.println("C1");
	}
}
public class UpcastingEx2 extends C{

	public static void main(String[] args) {
		A1 obj=new C1();
		obj.test1();
		
		A1 obj1=new B1();
		obj1.test1();
		
		
		
		
		

	}

}
