package demo;

public class QuickSort {

public static void Quicksort(int arr[],int low,int high) {
	int mid=(low+high)/2;
	int i=low;
	int j=high;
	int pivot=arr[mid];
	
	while(i<=j) {
		while(arr[i]<pivot) {
			i++;
		}
			while(arr[j]>pivot) {
				j--;
			}
			
			if(i<=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		if(low<j) 
			Quicksort(arr,low,j);
		

		if(high>i) 
			Quicksort(arr,i,high);
		}
	

	public static void main(String[] args) {
		int[]arr= {10,80,30,90,40};
		
		Quicksort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
}
	}	
}


