package Inheritancepkg;

class N {
	int a, b;

	public void display() {
		System.out.println(a + b);
	}

}

class M extends N {
	int x, y;

	public void show() {
		System.out.println(x + y);
	}

}

class Z extends M {
	int p, q;

	public void add() {
		System.out.println(p + q);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		Z cobj = new Z();
		cobj.a=10;
		cobj.b=20;
		cobj.display();
		
		cobj.x=30;
		cobj.y=40;
		cobj.show();
		
		cobj.p=50;
		cobj.q=60;
		cobj.add();

	}

}
