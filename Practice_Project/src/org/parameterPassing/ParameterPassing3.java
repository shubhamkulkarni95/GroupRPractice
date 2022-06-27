package org.parameterPassing;

public class ParameterPassing3 {
	
	public static void main(String[] args) {
		ParameterPassing3 obj=new ParameterPassing3();
		int addition=obj.add(10, 2);
		System.out.println("Addition : "+addition);
		float subtraction=obj.sub(10f, 8f);
		System.out.println("Subtraction : "+subtraction);
		double multiplication= obj.mul(15.2, 2.3);
		System.out.println("Multiplication : "+multiplication);
		int division=obj.div(10, 2);
		System.out.println("Division : "+division);
		
		

	}
	public int add(int a,int b) {
		
		return a+b;
	}
	public float sub(float a,float b) {
		
		return a-b;
	}
	public double mul(double a,double b) {
		
		return a*b;
	}
	public int div(int a,int b) {
		
		return a/b;
	}

}
