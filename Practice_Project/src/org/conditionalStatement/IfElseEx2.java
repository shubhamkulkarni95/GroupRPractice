package org.conditionalStatement;

public class IfElseEx2 {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		if(a>b && b>c) {
			if(b>a && b>c) {
				if(c>a && c>b) {
				System.out.println("c is greater");
		}else{
			System.out.println("B is greater");
		}
			}
		}
		System.out.println("A is greater");
	}

}
