package org.string;

public class StringEx2 {

	public static void main(String[] args) {
		String str="Pune";
		int size=str.length();  //For size of that string
		System.out.println("Size : "+size);
		
		for(int i=0;i<size;i++) {
			System.out.println("charAt("+i+") = "+str.charAt(i));  //For indexing the char
		}
		
		
		System.out.println();
		
		//For trim the spaces
		String str1="  Hello Everyone.How are you?  ";
		str1=str1.trim();
		System.out.println(str1);
		
		System.out.println();
		
		//Index of Char
		
		System.out.println("'E' : "+str1.indexOf('E'));
		System.out.println();
		
		//Last index of
		
		System.out.println(str1.lastIndexOf("e"));
		System.out.println();
		
		//toUpperCase
		
		String str2="hello friends";
		str2=str2.toUpperCase();
		System.out.println();
		System.out.println();
		
		//toLowerCase
		
				String str3="HELLO FRIENDS";
				str3=str3.toLowerCase();
				System.out.println(str3);
				System.out.println();
				
		//Replaceto
				
				String str4="Hello";
				str4=str4.replace('H', 'Y');
				System.out.println(str4);
		
	}

}
