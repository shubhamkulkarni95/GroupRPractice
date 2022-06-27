package org.staticToStatic;

public class StaticToStatic {
	    int a,b;
		public static void test() {
			System.out.println("test method executed.");
		}
		public static void test1() {
			StaticToStatic obj=new StaticToStatic();
			obj.a=50;
			obj.b=80;
			int c=obj.a+obj.b;
			System.out.println("Addition : "+c);
			}
	public static void main(String[] args) {
		StaticToStatic obj1=new StaticToStatic();
		obj1.test();	//by using object this is not correct way to call static method
		test();			//by direct calling
		obj1.test1();	// by using object this is not correct way to call static method
		test1();		//by direcrt call
		
	}

}
