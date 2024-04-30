package demo;

import java.util.HashSet;

public class ContainsDuplicates {
public static void main(String[] args) {
	int[]arr= {1,2,3,1};
	System.out.println(containsDuplicates(arr));
}
public static boolean containsDuplicates(int[] arr) {
	HashSet<Integer>hs=new HashSet<Integer>();
	for(int i=0;i<arr.length;i++) {
		if(hs.contains(arr[i])) {
			return true;
		}
		hs.add(arr[i]);
	}
	return false;
	
}
}
