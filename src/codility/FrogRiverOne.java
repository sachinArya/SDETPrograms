package codility;

public class FrogRiverOne {
	
	public static void main(String[] args)
	{
		int A[] = {1,3,1,4,3,5,4};
		
		System.out.println(solution(5, A));
		
	}
	
	public static int solution(int X, int[] A) 
	{
		int sol = -1;
			
		for(int i=1; i<=X; i++)
		{
			boolean found = false;
			
			for(int j=0; j<A.length; j++)
			{
				if(A[j]==i)
				{
					if(sol<j)
					{
						sol=j;
					}
					
					found = true;
					break;
				}
				
			}
			
			if(found == false)
			{
				sol = -1;
				break;
			}
		}
		
		return sol;
	}

}
