 package demo1;

import java.util.HashSet;

public class InterSection {

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {2,4,5,8};
		printInterSection(arr1,arr2);
	}

	public static void printInterSection(int[] arr1, int[] arr2) {
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			}
		}
	}
}
