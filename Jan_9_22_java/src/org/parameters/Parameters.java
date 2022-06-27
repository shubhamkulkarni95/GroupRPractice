package org.parameters;

public class Parameters {
	public void test(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum = "+sum);
		
	}
	public static void main(String[] args) {
		Parameters obj=new Parameters();
		obj.test(10, 20, 30);
		
	}

}
