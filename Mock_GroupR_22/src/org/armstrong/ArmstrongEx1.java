package org.armstrong;

public class ArmstrongEx1 {
	public static void main(String[] args) {
		int num=153;
		//int temp;
		int mul=1;
		int arms=num;
		int count=0;
		int sm=0;
		int mg=num;
		while(arms!=0) {
			arms=arms/10;
			count++;
		}
		System.out.println("String count : "+count);
		
		while(num!=0) {
			int rem=num%10;
			for(int i=1;i<=count;i++) {
			mul=mul*rem;
			}
			sm=sm+mul;
			num=num/10;
		}
		System.out.println(sm);
//		if(mg==sm) {
//			System.out.println(mg+" the number is arm-strong");
//		}else {
//			System.out.println(mg+" the is not arm-strong");
//		}
     }

}
