package algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void sort(int[] arr)
	{
		boolean sorted=false;
		
		while(!sorted)
		{
			sorted = true;
			for(int i=0; i<arr.length -1; i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
					sorted = false;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
