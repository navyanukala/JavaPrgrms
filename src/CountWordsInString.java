
public class CountWordsInString {

	public static void main(String[] args) {
		
		String s="Selenium with java training automation";
		
		int count=1;
		//String temp=s.charAt(0);
		for(int i=0;i<=s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
