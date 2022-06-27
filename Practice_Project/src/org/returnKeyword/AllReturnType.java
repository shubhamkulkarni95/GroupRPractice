package org.returnKeyword;

public class AllReturnType {
	public void test1() {
		System.out.println("Test1--void");
	}
	public int test2() {
		System.out.println("Test2--int");
		return 1;
	}
	public short test3() {
		System.out.println("Test3--short");
		return 2;
	}
	public byte test4() {
		System.out.println("Test4--byte");
		return 3;
	}
	public long test5() {
		System.out.println("Test5--long");
		return 4;
	}
	public double test6() {
		System.out.println("Test6--double");
		return 2;
	}
	public float test7() {
		System.out.println("Test7--float");
		return 1.1f;
	}
	public char test8() {
		System.out.println("Test8--char");
		return 'A';
	}
	public boolean test9() {
		System.out.println("Test9--boolean");
		return true;
	}
	public static void main(String args[]) {
		AllReturnType obj=new AllReturnType();
		System.out.println(obj.test2());
		System.out.println(obj.test3());
		System.out.println(obj.test4());
		System.out.println(obj.test5());
		System.out.println(obj.test6());
		System.out.println(obj.test7());
		System.out.println(obj.test8());
		System.out.println(obj.test9());
		
		
	}

}
