package org.returnKeyword;

public class ReturnKeyword {
	public void addition() {
		int a=10,b=10;
		int c=a+b;
		System.out.println("c = "+c);
		return;    //it is by default hidden in void method
	}
	public static void main(String args[]) {
		ReturnKeyword obj=new ReturnKeyword();
		obj.addition();
	}

}
