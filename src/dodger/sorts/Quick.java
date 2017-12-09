package dodger.sorts;

public class Quick implements Sort
{
    private int[] arr;
    
    public int[] sort(int[] nums)
    {
	arr = nums;
	int high = arr.length - 1;
	int low = 0;
	
	quicksort(low, high);
	
	return arr;
    }
    
    private void quicksort(int low, int high)
    {	
	if (low < high)
	{
	   int p = partition(low, high);
	   quicksort(low, p - 1);
	   quicksort(p + 1, high);
	}
    }
    
    private int partition(int low, int high)
    {
	int pivot = arr[high];
	int i = low - 1;
	
	for (int j = low; j < high; j++)
	{
	    if (arr[j] <= pivot)
	    {
		i++;
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	    }
	}
	
	int tmp = arr[i+1];
	arr[i+1] = arr[high];
	arr[high] = tmp;
	
	return i+1;
    }
}
