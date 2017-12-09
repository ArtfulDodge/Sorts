package dodger.sorts;

public class Bogo implements Sort
{
    public int[] sort(int[] nums)
    {
	while (!isSorted(nums))
	{
	    shuffle(nums);
	}
	return nums;
    }

    private boolean isSorted(int[] nums)
    {
	for (int i = 0; i < nums.length - 1; i++)
	{
	    if (nums[i] > nums[i + 1])
	    {
		return false;
	    }
	}
	return true;
    }
    
    private int[] shuffle(int[] nums)
    {
	for (int i = 0; i < nums.length; i++)
	{
	    int j = (int) (Math.random() * nums.length - 1);
	    int tmp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = tmp;
	}
	
	return nums;
    }
}
