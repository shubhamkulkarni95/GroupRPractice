package org.parameterPassing;

public class ParameterPassing {
	
	public static void main(String[] args) {
		ParameterPassing obj=new ParameterPassing();
		obj.add(10, 2);
		obj.sub(10, 8);
		obj.mul(15, 2);
		obj.div(10, 2);
		
		

	}
	public int add(int a,int b) {
		System.out.println("Addition : "+(a+b));
		return a+b;
	}
	public int sub(int a,int b) {
		System.out.println("Subtraction : "+(a-b));
		return a-b;
	}
	public int mul(int a,int b) {
		System.out.println("Multiplication : "+(a*b));
		return a*b;
	}
	public int div(int a,int b) {
		System.out.println("Division : "+(a/b));
		return a/b;
	}

}
