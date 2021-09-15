
public class Solution {

	public static void main(String[] args) {
		 int[] N = {40,20,30,10,50,60,200,80};
			
			int[] val = solution(N);
			System.out.println(val[0]);


		}
			
			static int[] solution(int[] N) {

				int temp;  
				for (int i = 0; i < N.length; i++)   
				        {  
				            for (int j = i + 1; j < N.length; j++)   
				            {  
				                if (N[i] > N[j])   
				                {  
				                    temp = N[i];  
				                    N[i] = N[j];  
				                    N[j] = temp;  
				                }  
				            }  
				        }  
				       return N;

	}

}
