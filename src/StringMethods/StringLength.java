package StringMethods;

public class StringLength {

	public static void main(String[] args) {
		
		String s="Navya";
		
		//length of the string
		System.out.println(s.length());
		
		//Concatinatiom
		
		String s1= "Welcome";
		String s2="training";
		System.out.println(s1+" " +s2);
		System.out.println(s2.concat(s1));
		System.out.println("welcome" + "Navya");
		System.out.println("welcome".concat("nnr"));
		
		//equals
		String str1="Sdet";
		String str2="sdet";
		System.out.println(str1.equals(str2));//false
		
		//equalsignorecase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Contains
		System.out.println(s.contains("abc"));
		
		//substring
		System.out.println(s.substring(0,3));
		//replace
		System.out.println(s.replace("vya","nnr"));

	}

}
