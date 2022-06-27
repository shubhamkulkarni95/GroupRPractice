
package org.methods;

public class Method {
	int a=10;
	int b=20;
	public static void main(String[] args) {
		System.out.println("**Program Start**");	
		Method obj=new Method();
		int sum=obj.a+obj.b;
		System.out.println("Addition Of Two Number : "+sum);
		//obj.test();
		obj.test1();
	}
	public void test1() {
		System.out.println("Example of Test1");
		Method obj=new Method();
		obj.test();
		
	}
	public void test() {
		System.out.println("Example of Test");
	}
}
