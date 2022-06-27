package org.mockGroupBasic;

public class PracticeWithM {
	int a=10,b=20;
	int sum=a+b;
	public static void main(String[] args) {
		System.out.println("Program Start");
		PracticeWithM obj=new PracticeWithM();
		System.out.println("Addition = "+obj.sum);
		obj.test1();
		
		System.out.println("Program Ends");
	}
	public void test1() {
		System.out.println("Hello I'm Test1");
		System.out.println("** Way one call directly **");
		//Way 1
		test2();
		//way 2 by using object
		System.out.println("** Way two by using object **");
		PracticeWithM obj1=new PracticeWithM();
		obj1.test2();
		System.out.println("** Way three by using this keyword **");
		this.test2();
		}
	public void test2() {
		int c=10,d=20;
		int mul=c*d;
		System.out.println("Multiplication is : "+mul);
	}

}
