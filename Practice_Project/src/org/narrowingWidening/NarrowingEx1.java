package org.narrowingWidening;

public class NarrowingEx1 {
	public static void main(String args[]) {
		long k=102;
		short s1=(short)k;
		System.out.println("s1 = "+s1);  //explicit narrowing
		float f1=10.2564132198f;
		int i=(int)f1;  //explicit narrowing
		System.out.println("i = "+i);
	}

}
