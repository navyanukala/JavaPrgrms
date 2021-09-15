package Inheritancepkg;

class A {
	int a;
	int b;

	public void display() {
		System.out.println(a + b);
	}
}

class B extends A
{
	int x;
	int y;

	public void show() {
		super.a=20;
		this.y=10;
		System.out.println(x + y);
	}
}

public class Test1 {

	public static void main(String[] args) {
		/*A aobj= new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();*/
		
		B bobj= new B();
		bobj.x=10;
		bobj.y=20;
		bobj.show();
		
		bobj.a=32;
		bobj.b=23;
		bobj.display();
		

	}

}
