package org.narrowingWidening;

public class TypeCastReturnType {
		public byte Additionbyte (){
			byte a=10,b=20;
			return (byte)(a+b);
		    }
		public int AdditionInt() {
			int a=25,b=60;
			return (int)(a+b);
		}
		public float AdditionFloat() {
			float a=20f,b=63.3f;
			return (float)(a+b);
		}
		public short AdditionShort() {
			short a=1,b=2;
			System.out.println("AdditionShort : "+(a+b));
			return 1;
		}
	public static void main(String[] args) {
		TypeCastReturnType obj=new TypeCastReturnType();
		System.out.println("byte = "+obj.Additionbyte());
		System.out.println("Float = "+obj.AdditionFloat());
		System.out.println("Int = "+obj.AdditionInt());
		obj.AdditionShort();
	}

}
