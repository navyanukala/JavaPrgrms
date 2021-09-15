package Exceptions;

public class Exception2 {
	
	
	    //defining a method  
	    public static void checkNum(int num) {  
	        if (num < 1) {  
	            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
	        }  
	        else {  
	            System.out.println("Square of " + num + " is " + (num*num));  
	        }  
	    }  
	    //main method  
	   
	 

	public static void main(String[] args) {
		
		Exception2 obj = new Exception2();  
        obj.checkNum(-3);  
        System.out.println("Rest of the code..");  

	}

}
