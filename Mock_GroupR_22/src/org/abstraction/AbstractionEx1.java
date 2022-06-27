package org.abstraction;


abstract class abc{
	abstract void add();
	public void simple(){
		System.out.println("This is not Abstract method");
	}
}
abstract public class AbstractionEx1 extends abc {
//	void add() {
//		int a=10;
//		int b=20;
//		int c=a+b;
//		System.out.println("Addition : "+c);
//	}

	public static void main(String[] args) {
		AbstractionEx1 obj=new AbstractionEx1() {
			void add() {
				int a=10;
				int b=20;
				int c=a+b;
				System.out.println("Addition : "+c);
			}

		};
		obj.add();
		}
}
