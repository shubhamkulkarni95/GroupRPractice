package org.mockGroupBasic;

 class Parent {
		int a=10;
		public void ex1() {
			int b=20;
			int c=a+b;
			System.out.println("Addition : "+c);
		}
	}
	public class SingleInheritance extends Parent{
		public static void main(String[] args) {
			SingleInheritance obj=new SingleInheritance();
			obj.ex1();
		}
	}

