package demo;

import java.util.Arrays;

public class RotationOfArray {
public static void main(String[] args) {
	int[]nums= {1,2,3,4,5,6,7};
	int k=3;
	System.out.println(Arrays.toString(rotationOfArray(nums,k)));
}
public static int[] rotationOfArray(int nums[], int k) {
	int n=nums.length;
	reverse(nums,0,n-1);
	reverse(nums,0,k-1);
	reverse(nums,k,n-1);
	return nums;
	
	
}
private static void reverse(int[] nums, int i, int j) {
	while(i<=j) {
	int temp=nums[i];
	nums[i]=nums[j];
	nums[j]=temp;
	i++;
	j--;
	}
}
}
