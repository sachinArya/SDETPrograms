package codility;

import java.util.Arrays;

public class MaxCounters {
	
	public static void main(String args[])
	{
		int A[] = {3,4,4,6,1,4,4};
		System.out.println(Arrays.toString(solution(3, A)));
	}
	
	public static int[] solution(int N, int[] A)
	{
		int arr[] = new int[N];
		int maxValue =0;
		
		for(int i=0; i<A.length; i++)
		{
			if(A[i]>=1 && A[i]<=N)
			{
				arr[A[i]-1] +=1;
				if(maxValue<arr[A[i] -1])
					maxValue = arr[A[i]-1];
			}
			else if(A[i] == N+1)
			{
				arr = new int[N];
			    Arrays.fill(arr, maxValue);
				
			}
		}
			
		
		return arr;
	}

}
