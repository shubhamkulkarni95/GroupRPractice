package org.returnKeyword;

public class ReturnFloatEx1 {
	public float sub() {
		float a=10.2f;
		float b=2.2f;
		float c=a-b;
		System.out.println("Subtraction : "+c);
		return 1.1f;
	}
	public int sub(int a,float b) {
		return (int)(a*b);
	}
	public static void main(String args[]) {
		ReturnFloatEx1 obj=new ReturnFloatEx1();
		obj.sub();
		System.out.println("Multiplication : "+obj.sub(10,2.5f));
	}

}
