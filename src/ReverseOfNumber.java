import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		 int n,r;
		int rev=0;
		 Scanner s= new Scanner(System.in);
		 System.out.println("enter number" + " ");
		n= s.nextInt();
		 while(n>0)
		 {
			 r=n%10;//
			 rev=rev*10+r;
			 n=n/10;
		 }
		 System.out.println(rev);
		
		//By using string buffer
		/*StringBuffer sb= new StringBuffer(String.valueOf(n));
		rev=sb.reverse();
		System.out.println(rev);*/
		
		//By using string builder
		/*StringBuilder sbl= new StringBuilder();
		sbl.append(n);
		rev=sbl.reverse();
		
		System.out.println(rev);*/
	}

}
