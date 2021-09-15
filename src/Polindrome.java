import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		
		int rev=0;
		int orgnum=n;
		
		while(n!=0)
		{
			rev=rev*10 + n%10;
		n=n/10;
			
		}
		if(orgnum==rev)
		{
			System.out.println("given number is polindrome");
		}
		else
		{
			System.out.println("given number is not polindrome");
		}
		

	}

}
