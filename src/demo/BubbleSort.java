package demo;

import java.util.Arrays;

public class BubbleSort {
public static void main(String[] args) {
	int arr[]= {5,1,7,10,6};
	System.out.println("Arrays before sorting:"+Arrays.toString(arr));
	int length=arr.length;
	for (int i=0; i<length-1; i++) {
		for (int j=0; j<length-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("Arrays after sorting:"+Arrays.toString(arr));
}
}
