package org.returnKeyword;

public class ReturnIntEx1 {
	public int addition() {
		int a=5,b=10,c=a+b;
		System.out.println("c = "+(c));
		return 10;
	}
	public static void main(String args[]) {
		ReturnIntEx1 obj1=new ReturnIntEx1();
		obj1.addition();
	}

}
