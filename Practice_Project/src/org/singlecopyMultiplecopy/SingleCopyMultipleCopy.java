package org.singlecopyMultiplecopy;

public class SingleCopyMultipleCopy {
	int a=50;
	static int b=77;
	public static void main(String[] args) {
		int c;
		SingleCopyMultipleCopy obj=new SingleCopyMultipleCopy();
		System.out.println("a = "+obj.a);
		System.out.println("b = "+obj.b);
		System.out.println("c = "+(obj.a+obj.b));
		SingleCopyMultipleCopy obj1=new SingleCopyMultipleCopy();
		obj1.a=60;
		obj1.b=88;
		System.out.println("c = "+(obj.a+obj.b));
	}

}
