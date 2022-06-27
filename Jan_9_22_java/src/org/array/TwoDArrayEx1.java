package org.array;

public class TwoDArrayEx1 {

	public static void main(String[] args) {
		int ar[][]=new int[3][3];
		ar[0][0]=40;
		ar[0][1]=30;
		ar[0][2]=20;
		
		ar[1][0]=100;
		ar[1][1]=90;
		ar[1][2]=80;
		
		ar[2][0]=70;
		ar[2][1]=60;
		ar[2][2]=50;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
			}
		}
		
	}

}
