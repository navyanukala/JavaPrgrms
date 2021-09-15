package Exceptions;

import java.io.IOException;

public class Exception1 {
	
	public void m1() 
	{
		int a=10;
		System.out.println(a);
		if(a>0)
		{
		
		int s= a/0;
		
		throw new ArthemeticException("s");
		}
	}
//	public void m2() throws InterruptedException
//	{
//		int b=10;
//		System.out.println(b);
//		Thread.sleep(5000);
//	}
	public static void main(String[] args) {
		
		Exception1 e= new Exception1();
		
		

	}

}
