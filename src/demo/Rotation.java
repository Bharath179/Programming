package demo;

public class Rotation {
public static void main(String[] args) {
	int nums[]= {1,2,3,4,5,6,7};
	int n=4;
	
	for(int i=0;i<n;i++) {
	int first=nums[0],j;
	for(j=0;j<nums.length-1;j++) {
		nums[j]=nums[j+1];
	}
	nums[j]=first;
}
	for(int i=0;i<nums.length;i++) {
		System.out.print(nums[i]+" ");
	}
}
}
