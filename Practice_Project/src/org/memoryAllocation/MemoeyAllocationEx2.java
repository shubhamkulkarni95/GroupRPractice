package org.memoryAllocation;

public class MemoeyAllocationEx2 {
	int a=50,b=80;
	public void test() {
		System.out.println("Test 1 executed."); 
		MemoeyAllocationEx2 obj=new MemoeyAllocationEx2();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		obj.test2();
		System.out.println("**By using this keyword.**");
		System.out.println("a = "+this.a);
		System.out.println("b = "+this.b);
		this.test2();
	}
	public void test2() {
		System.out.println("Test2 executed.");
	}
	public static void main(String[] args) {
		MemoeyAllocationEx2 obj1=new MemoeyAllocationEx2();
		obj1.test();

	}

}
