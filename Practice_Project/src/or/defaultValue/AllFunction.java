package or.defaultValue;

public class AllFunction {
	public static void main(String args[]) {
		System.out.println("Hello");
		Ex1 obj=new Ex1();
		System.out.println(obj.a);
		obj.test1();
		obj.test2();
		
	
		
	}
}
	 class Ex1{
		int a=10;
		public void test1() {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}
		public  void test2() {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
		}
		
	}


