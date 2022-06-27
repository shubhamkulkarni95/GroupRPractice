package org.narrowingWidening;

public class WidenningEx1 {
	public static void main(String args[]) {
		int a=10;
		float f=a;   //implicit widenning
		float f1=(float)a; //expicit widenning
		System.out.println("implicit f = "+f);
		System.out.println("explicit f1 = "+f1);
		double d=a;
		double d1=(double)a;
		System.out.println("d = "+d);
		System.out.println("d1 = "+d1);
		char c=(char)a;
		System.out.println("c = "+c);		
	}

}
