package org.singleton;

	class Parent1{
		private int a=10;
		static Parent1 obj;
		private Parent1() {};
		public static Parent1 returnPrent1Object(){
			for(int i=3;i<=3;i--) {
				if(obj!=null) {
				obj=new Parent1	();
				}
			}
			Parent1 obj=new Parent1();
			return obj;
		}
		
	}

public class SingletonEx3Max3Obj {

	public static void main(String[] args) {
		Parent1 obj1=Parent1.returnPrent1Object();
		System.out.println("Obj1.a = "+obj1);
		

	}

}
