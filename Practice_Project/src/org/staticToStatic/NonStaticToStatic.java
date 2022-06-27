package org.staticToStatic;

public class NonStaticToStatic {
	static int a=10,b=20;
	public static void test() {
		System.out.println("Test method executed");
	}
	public static void test1() {
		System.out.println("Test1 method executed.");
	}
	public void test2() {
	System.out.println("Test2 method executed.");
	//way 1: call directly by name
	System.out.println("a = "+a);
	System.out.println("b = "+b);
	test();
	test();
	//way 2: call by object
	NonStaticToStatic obj=new NonStaticToStatic();
	System.out.println("a = "+obj.a);
	System.out.println("b = "+obj.b);
	obj.test();
	obj.test1();
	//way 3 : 
	}
}
