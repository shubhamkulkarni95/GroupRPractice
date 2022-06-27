package org.singleCopyMultipleCopy;

public class SingleCopyMulCopy {
   int a=10;
   static int b=77;   //Static global variable
   public static void main(String[] args) {
	   SingleCopyMulCopy obj=new SingleCopyMulCopy();
	   SingleCopyMulCopy obj1=new SingleCopyMulCopy();
	   // obj.a=100;
	   System.out.println("value of a = "+obj.a);
	   System.out.println("value of a with second object = "+obj1.a);
	   System.out.println("Value of a with changing with object = "+(obj.a=100));
	   System.out.println("Value of a with changing with object = "+obj1.a);
	   System.out.println("Value of b = "+obj.b);
	   System.out.println("Value of a with second object = "+obj1.b);
	   System.out.println("Value of b with changing with object = "+(obj.b=80));
	   System.out.println("Value of b now = "+obj1.b);
	   
   }
   

}
