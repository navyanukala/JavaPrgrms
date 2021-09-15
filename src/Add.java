
public class Add {
	
	public void addition(float a, double b)
	{
		System.out.println(a+b);
	}
	public void addition(double a, float b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {

		Add a= new Add();
		a.addition(2,3);
		

	}

}
