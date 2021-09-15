import java.util.Scanner;

public class Swap2NumbersWithout3rdvariable {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value");
		a=s.nextInt();
		System.out.println("Enter b value");
		b=s.nextInt();

		a=a+b;
		b=a-b;
		a=a-b;
		
		//Logic2 multiplication and division..a and b should not be 0
		a=a*b;   //200
		b=a/b;   //200/20-----10
		a=a/b;    //200/10---20
		
		
		System.out.println( "a value is" + a);
		System.out.println( "a value is" + b);
	}

}
