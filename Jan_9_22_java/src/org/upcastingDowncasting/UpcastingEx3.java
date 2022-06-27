package org.upcastingDowncasting;

class AA{
	public void test1() {
		System.out.println("Test 1---->Class AA");
	}
}
class BB extends AA{
	public void test1() {
		System.out.println("Hello");
		System.out.println("Test 2----->Class BB");
	}
}
class CC extends BB {
	public void test1() {
		System.out.println("Hi,Good Morning.-> class CC");
		System.out.println("Test 3----->Class CC");
	}
}
public class UpcastingEx3 {

	public static void main(String[] args) {
		CC c1=new CC();
	//	c1.test1();
		BB b1=(BB)c1;
		b1.test1(); 
		//it will be access because here we overload method
		//that's why it can't understand where we restric the access tha's why 
		//it returns last(child class) value.
		
		AA a1=(AA)c1;
		a1.test1();
		
		System.out.println("***********************");
		BB b2=new BB();
		b2.test1();
		
		AA a2=new AA();
		a2.test1();

	}

}
