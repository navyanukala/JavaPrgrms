
public class ReverseOfString {

	public static void main(String[] args) {
		
		String s= "Navya";
		String rev="";
		
		int len=s.length();
		
		//logic1
		/*for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}*/
		//System.out.println(rev);
		
		//logic2  chareacter array
		
		//converting string into character array
		/*char a[]=s.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i]; 	
		}
		System.out.println(rev);*/
		
		//logic3 stringbuffer
		StringBuffer sb= new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
