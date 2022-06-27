package org.mockGroupBasic;

public class LocalGlobalVariable {
	int a=10,b=20;  		//globle variable
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		LocalGlobalVariable obj=new LocalGlobalVariable();
		System.out.println("Value of a before changing : "+obj.a);
		System.out.println("Value of b before changing : "+obj.b);
		obj.a=30;
		obj.b=50;
		System.out.println("Value of a after changing : "+obj.a);
		System.out.println("Value of b after changing : "+obj.b);
		LocalGlobalVariable obj1=new LocalGlobalVariable();
		System.out.println("");
		System.out.println("Value of a with using second objec : "+obj1.a);
		System.out.println("Value of b with using second objec : "+obj1.b);
		//		int c=obj.a+obj.b;		//Local Variable-
//		System.out.println("Sum = "+c);
//		System.out.println("** Program Starts **");
	}
	

}
