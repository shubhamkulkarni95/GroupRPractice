package org.mockGroupBasic;

public class OneDArray2 {

	public static void main(String[] args) {
		int[] ar=new int[5];
		ar[0]=35;
		ar[1]=95;
		ar[2]=-45;
		ar[3]=60;
		ar[4]=-36;
		System.out.println(ar.length);
		System.out.println("");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			//System.err.println(ar[i]);
		}
	}

}
