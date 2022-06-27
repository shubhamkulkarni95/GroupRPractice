package org.mockGroupBasic;

	class Parent1{
		public int addition(int a,int b) {
			return a+b;
		}
		public int subtraction(int a,int b) {
			return a-b;
		}
	}
public class MethodOverridding extends Parent1 {
	public int addition(int a,int b) {
		System.out.println("Sum = "+(a+b));
		return a+b;
	}
	public int subtraction(int a,int b) {
		System.out.println("Sub = "+(a-b));
		return a-b;
	}
	public static void main(String[] args) {
		MethodOverridding obj=new MethodOverridding();
		obj.addition(10, 20);
		obj.subtraction(20,10);

	}

}
