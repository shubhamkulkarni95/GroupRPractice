package org.array;

public class SelectionSort {

	public static void main(String[] args) {
		int ar[]= {12,8,2,857};
		System.out.println("Before sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.println("a["+i+"] = "+ar[i]);
		}
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				}
			}
			if(i==1) {
				System.out.println("2nd Heighest");
				System.out.println(ar[i]);
				break;
			}
		}
		
		System.out.println("After Sorting");
		for(int i=0;i<ar.length;i++) {
			System.out.println("a["+i+"] = "+ar[i]);
		}
		
		}
}
