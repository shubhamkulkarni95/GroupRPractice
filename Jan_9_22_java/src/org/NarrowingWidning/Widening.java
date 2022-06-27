package org.NarrowingWidning;

public class Widening {
public static void main(String[] args) {
	System.out.println("******Program Start for byte to short******");
	byte b1=120;
	short s1=b1;    // Implicit widening
	System.out.println("Byte b1 = "+b1 );
	System.out.println("Short s1 = "+s1);
	short s2=(short)b1;  //Explicit widening
	System.out.println("short s2 = "+s2);
	System.out.println("******Program Ends for byte to short******");
	System.out.println("******Program Start for byte to int******");
    byte b2=100;
    int i1=b2;
    System.out.println("Byte b2 = "+b2);
    System.out.println("Integer i1 = "+i1);
    System.out.println("******Program end for byte to int******");
    System.out.println("******Program Start for byte to long******");
    byte b3=90;
    long l1=b3;
    System.out.println("Byte b3 = "+b3);
    System.out.println("Long l1 = "+l1);
    System.out.println("******Program end for byte to long******");
}
}
