package org.collectionPractice;

import java.util.ArrayList;

public class CollectionPracticeEx1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();   //Declaration
		ar.add(new Integer(10));		//Add object of non-primitive data type
		ar.add(new CollectionPracticeEx1()); //Add object of class.
		ar.add(new String("Mumbai"));
		ar.add(new Character('D'));
		ar.add(-500);		//implicit boxing
		ar.add((short)10);	//explicit narrowing boxing
		ar.add(new Byte((byte)10));
		ar.add("Pune");
		System.out.println(ar);
		
	}

}
