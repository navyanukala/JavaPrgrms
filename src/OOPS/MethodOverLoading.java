package OOPS;

public class MethodOverLoading {
	
	int a=10,b=20;
			void sum()
			{
				System.out.println(a+b);
			}
			 void sum(int x, int y)
			{
				System.out.println(x+y);
			}
			 void sum(int x, int y,int z)
				{
					System.out.println(x+y+z);
				}
			 void sum(int x, double y)
				{
					System.out.println(x+y);
				}




	public static void main(String[] args) {
		
		MethodOverLoading mo= new MethodOverLoading();
		mo.sum();
		mo.sum(50,60);
		mo.sum(50,60,10);
		mo.sum(50,60.60);
		
	}

}
