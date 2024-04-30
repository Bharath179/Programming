package demo;

import java.util.Arrays;

public class ProductOfArrayExpectSelf {

	public static void main(String[] args) {
		int[]nums= {1,2,3,4};
		product(nums);
		System.out.println(Arrays.toString(product(nums)));
	}

	public static int[] product(int[] nums) {
		int[] prod=new int[nums.length];
		prod[0]=1;
		for(int i=1;i<nums.length;i++) {
			prod[i]=prod[i-1]*nums[i-1];
		}
		int temp=1;
		for(int i=nums.length-2;i>=0;i--) {
			prod[i]*=nums[i+1]*temp;
			temp*=nums[i+1];
		}
		return prod;
	}
	
}
