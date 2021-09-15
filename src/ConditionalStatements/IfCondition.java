package ConditionalStatements;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		 
		 Scanner s = new Scanner(System.in);
		 System.out.println("enter age value");
		 int age=s.nextInt();
		//int age=15;
		 if(age>=18)
		 {
			 System.out.println("eligible for vote");
		 }
		 else
		 {
			 System.out.println("not eligible for vote");
		 }

	}

}
