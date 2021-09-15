package AccessModifiers;
//with in the package only we can access....not outside package

class B
{
	int b=10;
	int m1()
	{
		System.out.println(b);
		return 20;
	}
}
public class DefaultAccessModifier {

	public static void main(String[] args) {
		B bobj = new B();
		int i=bobj.b;
		int j=bobj.m1();
		System.out.println(i);
		System.out.println(j);
		

	}

}
