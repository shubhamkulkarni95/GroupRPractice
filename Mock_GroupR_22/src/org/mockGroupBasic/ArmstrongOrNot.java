package org.mockGroupBasic;

public class ArmstrongOrNot {
	public static void main(String[] args) {
		int no=407;
		int t1=no;
		int leng=0;
		int t2=no;
		int rem;
		int arm=0;
		while(t1!=0) {
			t1=t1/10;
			leng=leng+1;
		}
		while(t2!=0) {
			rem=t2%10;
			int mul=1;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(no==arm) {
		System.out.println("number is arm strong.");
		}
		else {
			System.out.println("Number is not Arm Strong.");
		}
	}

}
