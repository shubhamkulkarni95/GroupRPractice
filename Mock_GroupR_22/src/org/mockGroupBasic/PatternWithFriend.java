package org.mockGroupBasic;

public class PatternWithFriend {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
				for(int k=1;k<=i;k++) {
					if(k==i) {
						System.out.print(" *");
					}
				}
			
			System.out.println("");
		}
	}
}

