package org.singleton;
class ClassB{
	int a=10;
	static ClassB obj;
	private ClassB() {};//Constructor Encapsulation Concept.
	public static ClassB getInstanceOfClassB() {
		if(obj==null) {
		obj=new ClassB();
		}
		return obj;
	}
	

}
public class SingletonEx2 {
	
	public static void main(String[] args) {
		ClassB obj1=ClassB.getInstanceOfClassB();
		System.out.println("Obj1.a = "+obj1.a);
		obj1.a=500;
		System.out.println("Obj1.a = "+obj1.a);
		System.out.println("*************");
		ClassB obj2=ClassB.getInstanceOfClassB();
		System.out.println("Obj2.a = "+obj2.a);
		obj1.a=800;
		System.out.println("Obj1.a updated value : "+obj1.a);
		System.out.println("*************");
		ClassB obj3=ClassB.getInstanceOfClassB();
		System.out.println("Obj3.a = "+obj3.a);

		

	}

}
