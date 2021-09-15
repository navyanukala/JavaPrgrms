package StringMethods;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
        String B=sc.next();
        int n=A.length()+B.length();
        System.out.println(n);
        String output="No";
        if(A.compareTo(B)>0)
        {
        	output="Yes";
        }
		System.out.println(output);
		
		String fletter=A.substring(0,1);//h
		fletter=fletter.toUpperCase();//H
		String rletter=A.substring(1);//ello
		String fs=fletter.concat(rletter);
				//fletter+rletter;
		System.out.println(fs);
		
		String fletterb=B.substring(0,1);//h
		fletterb=fletterb.toUpperCase();//H
		String rletterb=B.substring(1);//ello
		String fsb=fletterb+rletterb;
		System.out.println(fsb);
		
		
//	char[] a=s.toCharArray();
//	
//	        
//	       char m= s.charAt(0);
//	       
//	       String fstring=m.toUppercase();
//	       
//	       for(int i=1;i<s.length()-1;i++)
//	       {
//	    	   String s1=s.charAt(i).toUpp
//	       }
//	    	   
//	       .toUppercase()+A.slice(1);
	        
	        
	}

}
