package org.UpcastingDowncasting;
class A3{
	public void test1(){
		System.out.println("Test1");
	}
}
class B3 extends A3{
	public void test2(){
		System.out.println("Hello Test2");
	}
}
class C3 extends B3{
	public void test3() {
		System.out.println("Hello Test3");
	}
}
public class DowncastingEx1 extends C3 {

	public static void main(String[] args) {
		A3 a1=new C3();
		a1.test1();
//		a1.test2();
//		a1.test3();
		
		B3 b1=(B3)a1;
		b1.test1();
		b1.test2();
//		b1.test3();
	}

}
//Prent Class Behavious like child class.
// without upcasting we can't do downcasting. 
