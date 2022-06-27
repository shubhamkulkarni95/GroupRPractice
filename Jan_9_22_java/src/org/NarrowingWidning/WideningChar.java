package org.NarrowingWidning;

public class WideningChar {
	public static void main(String[] args) {
		char ch='A';
		int i=ch;
		int i1=(int)ch;
		System.out.println("i = "+i);
		System.out.println("i1 = "+i1);
		char ch1='B';
		int i2=ch1;
		int i3=(int)ch1;
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		char ch2='C';
		int i4=(int)ch2;
		System.out.println("i4 = "+i4);
	}

}
