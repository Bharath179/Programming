package demo;

import java.util.Arrays;

public class Sum {
	
	public static int[] twoSum(int[]nums,int target){
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==(target-nums[i]))
					return new int[] {i,j};
			}
		}
		return nums;
	}
		public static void main(String[] args) {
			int[] nums = {2,7,11,27};
			int target = 9;
			
			System.out.println(Arrays.toString(twoSum(nums,target)));
			
			
		}
	}


