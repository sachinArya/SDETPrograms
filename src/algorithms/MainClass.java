package algorithms;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args)
	{
		int[] arr = {10, 15, 6 , 10, 3, 18, 2, 4};
		
		QuickSort.quickSort(arr, 0, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

}
