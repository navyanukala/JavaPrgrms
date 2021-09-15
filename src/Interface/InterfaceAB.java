package Interface;

interface M
{
	int a=11;
	void display();
}
interface N extends M
{
	int b=22;
	void show();
}

public class InterfaceAB implements N
{

	public void show()
	{
		System.out.println(a);
	}
	public void display()
	{
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		
		InterfaceAB iab=new InterfaceAB();
		iab.show();
		iab.display();
	}

}
