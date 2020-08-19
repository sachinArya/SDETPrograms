package codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args)
	{
		 int A[] = new int[] {1, 2, 3, 4};
		 int K = 4;
		 solution(A,K);
		 
		 System.out.println(Arrays.toString(A));
	}
	public static int[] solution(int[] A, int K)
	{
		if(A.length > 1)
		{
			for(;K>0;K--)
			{
				int temp = A[0];
				
				for(int i=0; i< A.length; i++)
				{
					if(i == A.length -1)
					{
						A[0] = temp;
					}
					else
					{
						int t = A[i+1];
						A[i+1] = temp;
						temp = t; 
					}
				}
			}
			
		}
		
		return A;
	}
}
