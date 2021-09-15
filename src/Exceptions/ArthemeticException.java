package Exceptions;

public class ArthemeticException {

	public static void main(String[] args) {
		 int a=100;
		 try
		 {
			 System.out.println(a/0);
			 System.out.println("entered to try block");// once exception is catched by catch block prgrm execution not returns to the try blk
		 }
		 catch(Exception e)
		 {
			 System.out.println("entered to catch block");
		 }
		 System.out.println(a);

	}

}
