package org.abstraction;


	abstract class add{
		abstract void addition();
		int a=10;
		int b=20;
	}
	public class AbstractionEx2 extends add{
		void addition(){
			int c=a+b;
			System.out.println("Additon : "+c);
		}
	public static void main(String[] args) {
		AbstractionEx2 obj=new AbstractionEx2();// {
//		void addition() {
//			int c=a+b;
//			System.out.println("Addition : "+c);
//		}
//		};
		obj.addition();
		
	}

	}

