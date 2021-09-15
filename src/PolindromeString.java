import java.util.Scanner;

public class PolindromeString {

	public static void main(String[] args) {

	 Scanner s= new Scanner(System.in);
	 System.out.println("enter string");
	 String str=s.next();
		int len = str.length();
		String rev = "";
		String orgstrng=str;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if(orgstrng==rev)
		{
			System.out.println("polindorme string");
		}

		else
		{
			
				System.out.println("not polindorme string");
			
		}
	}

}
