package demo;

public class JumpGame {
public static void main(String[] args) {
	int[]nums= {3,2,1,1,4};
	System.out.println(canJump(nums));
}
public static boolean canJump(int[] nums) {
	int finalPosition=nums.length-1;
	
	for(int idx=nums.length-2;idx>=0;idx--) {
		if(idx + nums[idx]>=finalPosition) {
			finalPosition=idx;
		}
	}
	return finalPosition==0;
}
}   
