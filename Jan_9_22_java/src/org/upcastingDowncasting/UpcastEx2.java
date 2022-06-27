package org.upcastingDowncasting;

class A{
	public void test1() {
		System.out.println("Test 1");
	}
}
class B extends A{
	public void test2() {
		System.out.println("Test 2");
	}
}
class C extends B {
	public void test3() {
		System.out.println("Test 3");
	}
}
public class UpcastEx2 {

	public static void main(String[] args) {
		C c1=new C();
		c1.test1();
		c1.test2();
		c1.test3();
		
		B b1=(B)c1; //explicit upcasting
	//	B b1=c1;    //implicit upcasting
		b1.test1();
		b1.test2();
	//	b1.test3(); // it shows error because test3 is in restricted mode
		
		A a1=(A)c1;
	//	A a1=c1;  //implicit upcasting
		a1.test1();
//		a1.test2();// // it shows error because test3 is in restricted mode
	//	a1.test3(); // it shows error because test3 is in restricted mode
	}

}
