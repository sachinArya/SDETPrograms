package codility;

import java.util.HashSet;
import java.util.Iterator;

public class OddOccurrencesInArray {
	
	public static void main(String args[])
	{
		int A[] = new int[] {9,3,9,7,3,9,9};
		
		System.out.println(solution(A));
	}
	
	 public static int solution(int[] A)
	 {
		 HashSet<Integer> occurance = new HashSet<Integer>();
		 
		 int ret = 0;
		 
		 for(int i=0; i<A.length; i++)
		 {
			 if(!occurance.contains(A[i]))
			 {
				 occurance.add(A[i]);
			 }
			 else
			 {
				 occurance.remove(A[i]);
			 }
		 }
		 
		 Iterator<Integer> i = occurance.iterator();
		 
		 while(i.hasNext())
		 {
			 ret = i.next().intValue();
		 }
		 
		 return ret;
		 
	 }

}
