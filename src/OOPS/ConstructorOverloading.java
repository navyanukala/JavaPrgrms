package OOPS;

public class ConstructorOverloading {
	int a;
	int b;
	ConstructorOverloading()
	{
		 a=10;
		 b=20;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ConstructorOverloading co= new ConstructorOverloading();
		co.display();
		
	}

}
