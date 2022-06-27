package org.mockGroupBasic;

public class PrimeNumber {
	public static void main(String[] args) {
		int i=11,temp=0;
		for(int j=2;j<=(i-1);j++) {
			if(i%j==0) {
				temp=temp+1;
				}
			}
		if(temp>1) {
			System.out.println("Number is not prime");
		}else {
			System.out.println("Number is Prime.");
		}
	}

}
