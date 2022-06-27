package org.mockGroupBasic;

public class StarPracticePattern4 {
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=8;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
//		for(int l=1;l<=8;l++) {
//			for(int m=8;m>=l;m--) {
//				System.out.print(" *");
//			}
//			for(int n=1;n>=l;n--) {
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
	}
}
}
