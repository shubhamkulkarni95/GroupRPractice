package org.memoryAllocation;

import javax.xml.crypto.dsig.XMLObject;

public class MemoryAllocationEx1 {
	int a=10,b=20;
	static int x=50,y=60;
	public static void test1() {
		System.out.println("Test1");
		MemoryAllocationEx1 obj=new MemoryAllocationEx1();
		System.out.println("a = "+obj.a +" b = "+obj.b);
		System.out.println("x = "+x+" y = "+y);
	}
	public void test2() {
		System.out.println("Test2");
	}
	public static void main(String[] args) {
		MemoryAllocationEx1 obj1=new MemoryAllocationEx1();
		System.out.println("A = "+obj1.a);
		System.out.println("B = "+obj1.b);
		obj1.test1();
		obj1.test2();
		
		
		
	}

}
