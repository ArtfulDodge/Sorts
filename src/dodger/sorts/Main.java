package dodger.sorts;

public class Main
{
    public static void main(String[] args)
    {
	Sort s = new Bogo();
	
	int[] nums = new int[200];
	
	for (int i = 0; i < nums.length; i++)
	{
	    nums[i] = i;
	}
	
	for (int i = 0; i < nums.length; i++)
	{
	    int j = (int)(Math.random()*nums.length);
	    int tmp = nums [i];
	    nums[i] = nums[j];
	    nums[j] = tmp;
	}
	
	for (int i = 0; i < nums.length; i++)
	{
	    System.out.print(nums[i] + " ");
	}
	
	System.out.println();
	
	nums = s.sort(nums);
	
	for (int i = 0; i < nums.length; i++)
	{
	    System.out.print(nums[i] + " ");
	}
    }
}
