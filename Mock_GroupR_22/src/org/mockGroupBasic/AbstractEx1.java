package org.mockGroupBasic;

		abstract class Writer {
			 public static void write() {
			 System.out.println("Reading...");
			 }
			}
			class Author extends Writer {
			 public static void write() {
			 System.out.println("Reading book");
			 }
			}
			public class AbstractEx1 extends Writer {
			 public static void write() {
			 System.out.println("Reading code");
			 }
			 public static void main(String[] args) {
				 AbstractEx1 w = new AbstractEx1();
			 w.write();
			 }
			}

	

