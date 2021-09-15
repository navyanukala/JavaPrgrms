
public class Factorial {

	public static void main(String[] args) {
		
		//4!--4*3*2*1---24
		
		int n=4;
		int factorial=1;
		
		for(int i=1;i<=n;i++)
		{
			 factorial= factorial*i;
		}
		System.out.println(factorial);
	}

}
