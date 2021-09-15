package OOPS;

public class StaticExample {
		 
	int a;
	static int b;
	static void m1()
	{
		System.out.println("m1 is static method");
	}
	 void m2()
	{
		System.out.println("m2 is non static method");
	}
	 void m3()
		{
			a=340;
			b=450;
			m1();
			m2();
		}

	public static void main(String[] args) {
		b=100;
		System.out.println(b);
		
		StaticExample se= new StaticExample();
		se.m2();
		se.m1();
		se.a=200;
		System.out.println(se.a);
		se.m3();
		

	}

}
