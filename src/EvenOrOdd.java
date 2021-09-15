import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int n=8;//directly giving number
		Scanner s= new Scanner(System.in);
		System.out.println("Eneter number");
		n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("The given number is even");
		}
		else
		{
			System.out.println("The given number is odd");
		}

	}

}
