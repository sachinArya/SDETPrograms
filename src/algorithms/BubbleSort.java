package algorithms;

public class BubbleSort {

	public static void sort(int[] arr)
	{
		int[] a = {10,15,19,3,4,2};
		boolean sorted=false;
		
		while(!sorted)
		{
			sorted = true;
			for(int i = 0; i<arr.length-1;i++)
			{
				if(arr[i] > arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					sorted = false;
				}
			}
		}
		
	}
}
