package org.typeCasting;

public class Widening {
	public static void main(String[] args) {
		System.out.println("byte to short");
		byte b1 = 120;
		short s1=b1;            //implicit widening
		System.out.println("byte b1 : "+b1);
		System.out.println("Short s1 : "+s1);
		short s2=(short)b1;    //Explicit widening 
		System.out.println("Short S2 = "+s2);
		System.out.println(" ");
		System.out.println("byte to long");
		long l1=b1;
		System.out.println("Long l1 = "+l1);
		long l2=(long)b1;
		System.out.println("long l2 = "+l2);
		System.out.println(" ");
		System.out.println("byte to int");
		int i1=b1;
		int i2=(int)b1;
		System.out.println("int i1 = "+i1);
		System.out.println("int i2 = "+i2);
		System.out.println(" ");
		System.out.println("byte to float");
		float f1=b1;
		float f2=(float)b1;
		System.out.println("Float f1 = "+f1);
		System.out.println("Float f2 = "+f2);
		System.out.println(" ");
		double d1=b1;
		double d2=(double)b1;
		System.out.println("Double d1 = "+d1);
		System.out.println("Double d2 = "+d2);
		System.out.println(" ");
		System.out.println("byte to");
		
	}

}
