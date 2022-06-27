package org.mockGroupBasic;

public class TwoDArray {
	public static void main(String[] args) {
		int[][] ar=new int[3][3];
		ar[0][0]=40;
		ar[0][1]=2;
		ar[0][2]=-65;
		
		ar[1][0]=20;
		ar[1][1]=4;
		ar[1][2]=26;
		
		ar[2][0]=-6;
		ar[2][1]=25;
		ar[2][2]=15;
		
		System.out.println("Length of array is : "+ar.length);
		System.out.println("ar[1][0] = "+ar[1][0]);
		System.out.println("ar[2][1] = "+ar[2][1]);
		System.out.println("");
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				//System.out.println("ar[i][j] = "+ar[i][j]);
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
			}
		}
	}

}
