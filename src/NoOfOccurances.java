
public class NoOfOccurances {

	public static void main(String[] args) {
		 String s="welcome to java";
		 int n=s.length();
		 System.out.println(n);
		// s.replace('e', "");
		String newstring=s.replace("e", "");
		System.out.println(newstring);
		int m=newstring.length();
		System.out.println(m);
		int count=n-m;
		System.out.println(count);
		 
		 
	}

}
