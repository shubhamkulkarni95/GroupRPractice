package org.mockGroupBasic;


	 class A{
		int a=10,b=20;
		//System.out.println("Addition : "+c);
		}
	 class B extends A{
		int c=a+b;
		}
	 class C extends B{
		int d=a-b;
	}
	 class D extends A{
		 public void addition() {
			 System.out.println("Addition : "+(a+b));
		 }
	 }
	public class Multipleinheritance extends C {
		public static void main(String[] args) {
			Multipleinheritance obj=new Multipleinheritance();
			System.out.println("Addition : "+obj.c);
			System.out.println("Subtraction : "+obj.d);			
	}
}
