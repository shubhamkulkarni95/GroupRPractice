package org.methods;

public class LocalVairable {
	int a=10;
	float b=10.44f;
	double c=10.5542;
	char d='A';
	boolean e=true;
	byte f=1;
	short g=2;
	long h=3;
	public static void main(String[] args) {
		LocalVairable obj=new LocalVairable();
		System.out.println("******Program Starts*******");
		System.out.println("Print value of int = "+obj.a);
		System.out.println("Print value of float = "+obj.b);
		System.out.println("Print value of double = "+obj.c);
		System.out.println("Print value of Char = "+obj.d);
		System.out.println("Print value of boolean = "+obj.e);
		System.out.println("Print value of Byte = "+obj.f);
		System.out.println("Print value of Short = "+obj.g);
		System.out.println("Print value of Long = "+obj.h);
		System.out.println("******Program Ends*******");
	}

}
