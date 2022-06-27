package org.accessSpecifier;

import org.accessSpecifierEx2.Ex2;

public class AccessSpecifierEx1 extends Ex2 {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	public static void main(String[] args) {
		System.out.println("****Program Starts*****");
		System.out.println();
		System.out.println("****With-in class AccessSpecifierEx1*****");
		AccessSpecifierEx1 obj=new AccessSpecifierEx1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println();
		System.out.println("****With-in Packages class Ex1*****");
		Ex1 obj1=new Ex1();
		System.out.println(obj1.x);
	//	System.out.println(obj1.y);	// Shows Error because of Private variable access within class only
		System.out.println(obj1.z);
		System.out.println(obj1.w);
		System.out.println();
		System.out.println("****Out-Side Packages class Ex2*****");
		AccessSpecifierEx1 obj2=new AccessSpecifierEx1();
	//	System.out.println(obj2.m); //Default
		System.out.println(obj2.s);	//public
	//	System.out.println(obj2.k);	//private
		System.out.println(obj2.g);	//proteceted gives error but we extend AccessSpecifierEx1 with Ex2 then not shows error
		System.out.println();
		System.out.println("****Program Starts*****");
	}
	

}
