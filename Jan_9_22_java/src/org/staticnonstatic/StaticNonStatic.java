package org.staticnonstatic;

public class StaticNonStatic {
	int a=10;
	int b=20;
	static int x=30;
	static int y=40;
	public static void main(String[] args) {
		StaticNonStatic ob=new StaticNonStatic();
		//int z=ob
		System.out.println("Addition of a & b = "+(ob.a+ob.b));
		System.out.println("Addition of x & y = "+(x+y));
		ob.test1();
		test2();
			
	}
	public void test1() {
		System.out.println("******Print Test1 Block*******");
		System.out.println("In Test1 print addition = "+(a+b));
		System.out.println("In Test1 print addition of x & y = "+(x+y));
		System.out.println("End test1 Block");
	//	test2();
	}
	public static void test2() {
		System.out.println("******Print Tets2 Block********");
		StaticNonStatic obj=new StaticNonStatic();
		System.out.println("In test2 print addition = "+(obj.a+obj.b));
		System.out.println("In test2 print addition = "+(x+y));
	}
	

}
