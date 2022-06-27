package org.collectionPractice;

import java.util.HashSet;
import java.util.Iterator;

public class ArrayToArrayList {

	public static void main(String[] args) {
		System.out.println("*******Program Starts********");
		HashSet<String> s1=new HashSet<String>();
		s1.add("Pune");
		s1.add("Mumbai");
		s1.add("Aurangabad");
		s1.add("Akola");
		s1.add("Amravati");
		System.out.println(s1);
		System.out.println("*******Program Ends********");
		Iterator<String> itr=s1.iterator();
		String str="";
		while(itr.hasNext()) {
			str=itr.next();
			System.out.println(str);
		}
		
		
	}

}
