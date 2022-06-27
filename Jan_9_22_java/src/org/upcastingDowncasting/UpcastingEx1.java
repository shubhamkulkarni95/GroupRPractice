package org.upcastingDowncasting;

class parent{
	public void test1() {
		System.out.println("Hello test in parent");
	}
}
class child1 extends parent{
	public void test2() {
		System.out.println("Hello test in child");
	}
}
class child2 extends child1{
	public void test3() {
		System.out.println("Hello test in child2");
	}
}
public class UpcastingEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("*****Simple Ex. of inheritance*****");
		 child2 c1=new child2();
		 c1.test1();
		 c1.test2();
		 c1.test3();
		 
	System.out.println("******Ex. of upcasting********");
	    child1 c2=(child1)c1;  //explicit upcasting
	    c2.test2();
	    c2.test1();
	  //  child1 c2=c1;   //implicit up-casting
	  //  child1 c2=new 
	    System.out.println("******Ex. of Upcasting2******");
	    
		 
		 

	}

}
