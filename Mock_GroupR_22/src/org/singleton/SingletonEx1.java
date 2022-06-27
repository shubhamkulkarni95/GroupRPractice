package org.singleton;
class ClassA{
	int a=10;
	//static ClassA obj;
	private ClassA() {};//Constructor Encapsulation Concept.
	public static ClassA getInstanceOfClassA() {
		//if(obj==null) {
		ClassA obj=new ClassA();
		//}
		return obj;
	}
	

}
public class SingletonEx1 {
	
	public static void main(String[] args) {
		ClassA obj1=ClassA.getInstanceOfClassA();
		System.out.println("Obj1.a = "+obj1.a);
		obj1.a=500;
		System.out.println("Obj1.a = "+obj1.a);
		System.out.println("*************");
		ClassA obj2=ClassA.getInstanceOfClassA();
		System.out.println("Obj2.a = "+obj2.a);

		

	}

}
