package dodger.sorts;

public class Bubble implements Sort
{
    public int[] sort(int[] nums)
    {
	while (!isSorted(nums))
	{
	    for (int i = 0; i < nums.length - 1; i++)
	    {
		if (nums[i] > nums[i + 1])
		{
		    int tmp = nums[i];
		    nums[i] = nums[i + 1];
		    nums[i + 1] = tmp;
		}
	    }
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
}
