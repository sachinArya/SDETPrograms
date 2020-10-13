package codility;

public class TapeEquilibrium {
	
	public static void main(String[] args)
	{
		int[] A = new int[] {-1000,1000};
		
		System.out.println(solution(A));
	}

	public static int solution(int[] A)
	{
		Integer lowest =null;
		for(int i=1;i<A.length;i++)
		{
			int a = Math.abs(sum(A,0,i) - sum(A,i,A.length));
			
			if(lowest==null||a<lowest)
			lowest = a; 
		}
		
		return lowest;
	}
	
	public static int sum(int A[], int start, int end)
	{
		int sum = 0 ;
		for(int i=start; i<end; i++)
		{
			sum = sum +  A[i];
		}
		
		return sum;
	
	}
}
