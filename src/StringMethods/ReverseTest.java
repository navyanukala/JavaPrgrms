package StringMethods;

import java.util.Scanner;

public class ReverseTest {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String s1="";
	       for(int i=A.length()-1;i>=0;i--)
	       {
	            s1=s1+A.charAt(i);
	       }
	       System.out.println(s1);
	        if(A.equals(s1))
	        {
	            System.out.println("Yes");
	        }
	        
	}

}
