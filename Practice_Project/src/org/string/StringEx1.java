package org.string;

public class StringEx1 {

	public static void main(String[] args) {
		String st=new String("My name is Shubham");
//		String [] ar = st.split("");
//		char [] ch=st.toCharArray();
		System.out.println(st);
		int leng=st.length();
		System.out.println("Length of string : "+leng);
		String rev="";
		for(int i=leng-1;i>=0;i--) {
			rev=rev+st.charAt(i);
			
		}
		System.out.print(rev);
	}

}
