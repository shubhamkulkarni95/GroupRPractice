package org.mockGroupBasic;

public class FibonaciSeries {
	public static void main(String[] args) {
	int a=0,b=1,c;
	System.out.print(a+" ");
	for(int j=1;j<=10;j++) {
		c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
	}
	}
}
