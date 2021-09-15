package Arrays;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int a[][]= new int[3][2];
		 a[0][0]=20;
		 a[0][1]=30;
		 
		 a[1][0]=40;
		 a[1][1]=50;
		 
		 a[2][0]=60;
		 a[2][1]=70;
		 
		/* for(int i=0;i<=2;i++)
		 {
			 for(int j=0;j<=1;j++)
			 {
				 System.out.print(a[i][j]+ " ");
			 }
			 System.out.println(" ");
		 }*/
		 for(int[] i:a)
		 {
			 for(int j:i)
			 {
				 System.out.print(j+ " ");
			 }
			 System.out.println();
		 }

	}

}
