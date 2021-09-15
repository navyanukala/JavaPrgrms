package Inheritancepkg;

class bank{
	int getrateofinterest()
	{
		return 0;
	}
}
class sbi extends bank
{
	int getrateofinterest()
	{
		return 10;
	}
}
class icic extends bank
{
	int getrateofinterest()
	{
		return 12;
	}
}
public class Overriding {

	public static void main(String[] args) {
		 
		sbi sbiobj= new sbi();
		System.out.println(sbiobj.getrateofinterest());
		
		icic icicobj= new icic();
		System.out.println(icicobj.getrateofinterest());
		

	}

}
