package algorithms;

public class QuickSort {
	
	
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int j = partition(arr, low, high);
			
			//call quick sort recursively for the left partition of the array
			quickSort(arr, low, j);
			
			//call the quick sort recursively for the right partition of the array
			quickSort(arr,j+1,high);
		}
		
	}
	
	
	/*
	 * there are 3 variations of doing partition which are commonly used to illustrate the algo.
	 * Here we are selecting the first element as pivot and perform comparison
	 * 
	 * This function will arrange the pivot element in such a way that all the element to its
	 * are smaller than pivot and the all the elements to right are bigger.
	 * It returns the new index where the pivot element is placed
	 */
	public static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[low];
		int i = low;
		
		while(low<high)
		{

			//keep on incrementing "low" till you find an element greater than pivot
			do
			{
				low = low + 1;
			}
			while(low < arr.length && arr[low]<=pivot);
			
			//keep on decrementing "high" till you get an element smaller than pivot
			do
			{
				high = high - 1;
				
			}
			while(arr[high]>pivot);
			
			/* once you get the element for low and high swap them so that the bigger elements are put on right
				and smaller on left.
			 */
			if(low<high)
			{
				swap(arr,low,high);
			}
			
		}
		
		//swap the location of pivot, so that it is brought from the start of the array to its rightful place
		swap(arr,i,high);
		
		return high;
		
	}
	
	
	/*
	 * This function is used to swap 2 elements of an array
	 */
	public static void swap(int[] arr, int indexToSwap, int indexToBeSwappedWith)
	{
		int temp = arr[indexToSwap];
		arr[indexToSwap] = arr[indexToBeSwappedWith];
		arr[indexToBeSwappedWith] = temp;
	}

}
