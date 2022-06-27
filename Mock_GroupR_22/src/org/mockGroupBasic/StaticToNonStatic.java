package org.mockGroupBasic;

public class StaticToNonStatic {
	int a=10,b=20;
	static int x=50,y=60;
	public static void main(String[] args) {
		StaticToNonStatic obj=new StaticToNonStatic();
		int sum=obj.a+obj.b;		//static to nonstatic //Standard way
		System.out.println(sum);
		obj.test3();
		obj.test4();
	}
	public static void test1() {	//static method
	//	StaticToNonStatic obj1=new StaticToNonStatic();
	//	obj1.test3();
		System.out.println("Hello test 1");
	
	}
	public static void test2() {//static method
		System.out.println("Hello test 2");
	}
	public void test3() {	//non-static method
		System.out.println("Hello test 3");
	}
	public void test4() {	//non-static method
		System.out.println("Hello test 4");
	}
	}
