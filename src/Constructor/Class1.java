package Constructor;

class A{
	int a=10;
	A()
	{
		System.out.println(a);
	}
}
class B extends A{
	int b=20;
	B()
	{
		System.out.println(b);
	}
}




public class Class1 {

	public static void main(String[] args) {
		
		B bobj= new B();
	}

}
