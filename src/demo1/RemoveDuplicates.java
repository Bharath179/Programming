package demo1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int nums[]= {1,1,2};
		System.out.println("The output is:"+removeDuplicates(nums));
	}
		
	    public static int removeDuplicates(int[] nums) {
	        int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        return j;
	    }
	
	}


