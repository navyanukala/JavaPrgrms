package AccessModifiers;

class A
{
	private int a=10;
	 void m1()
	{
		System.out.println(a);
	}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A aobj= new A();
		//aobj.a;//can not accessible as it is private
		aobj.m1();//can not accessible as it is private
		
		B bobj= new B();
		System.out.println(bobj.b);
		bobj.m1();
		
		

	}

}
