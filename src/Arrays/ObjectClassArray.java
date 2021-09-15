package Arrays;

public class ObjectClassArray {

	public static void main(String[] args) {
		
//		Object[] obj= new Object[4];
//		obj[0]=5;
//		obj[1]="String";
//		obj[2]=3.3;
//		obj[3]=true;
		
		Object obj[]= {5,"string",3.3,true};
		
		for(Object o:obj)
		{
			System.out.println(o);	
		}
		

	}

}
