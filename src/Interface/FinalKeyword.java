package Interface;

//final infront of variable---we can not change the value
//fina infront of method--we can not override
//final infront of class--we can not extend
class test
{
	final int a =10;
	
	  void m1()
	{
		 //a=20;//not possible--we can not change the value of final 
		System.out.println(a);
	}
	

}
class test123 extends test
{
	void m1()
	{
		System.out.println("m1 method");
	}
}

public class FinalKeyword {
	
 
	public static void main(String[] args) {
		
		test123 t= new test123();
		t.m1();
	
		

	}

}
