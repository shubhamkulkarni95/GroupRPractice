package org.basicPrograms;

public class LocalGlobalEx {
	int a=10,b=20;
public static void main(String[] args) {
	int c=30;
	LocalGlobalEx obj=new LocalGlobalEx();
	int Sum=obj.a+obj.b+c;
	System.out.println("Addition using global varibale : "+Sum);
	
}
}
