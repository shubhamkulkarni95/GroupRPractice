package org.Variables;


	class Add {
	int a=10,b=20;
	int c=a+b;
	public void add() {
		System.out.println("Addition : "+c);
	}
}

public class LocalVariable {
	public static void main(String[] args) {
//		LocalVariable obj=new LocalVariable();
		Add obj=new Add();
		obj.add();
	}

}
