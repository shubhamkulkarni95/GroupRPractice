package org.parameterPassing;

public class ParameterPassing2 {
	
	public static void main(String[] args) {
		ParameterPassing2 obj=new ParameterPassing2();
		int addition=obj.add(10, 2);
		System.out.println("Addition : "+addition);
		int subtraction=(int)(obj.sub(10f, 8f)); //exlicit narrowing
		System.out.println("Subtraction : "+subtraction);
		float multiplication= (float)(obj.mul(15.2, 2.3)); //exlicit narrowing
		System.out.println("Multiplication : "+multiplication);
		short division=(short)(obj.div(10, 2)); //exlicit narrowing
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
