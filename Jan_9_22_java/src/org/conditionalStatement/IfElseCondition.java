package org.conditionalStatement;

public class IfElseCondition {
	int a=50,b=20,c=30;
	public static void main(String[] args) {
		IfElseCondition obj=new IfElseCondition();
		if(obj.a>obj.b && obj.a>obj.c) {
			System.out.println("A is Greater");			
		}else if(obj.b>obj.a && obj.b>obj.c) {
			System.out.println("B is Greater");
		}else {
			System.out.println("C is greater");
		}
	}

}
