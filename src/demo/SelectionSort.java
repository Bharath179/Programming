package demo;

public class SelectionSort {
public static void main(String[] args) {
	int arr[]= {64,25,12,22,11};
	int length=arr.length;
	for (int i=0; i<length; i++) {
		int min=i;
		for (int j=i+1; j<length; j++) {
			if(arr[min]>arr[j]) 
				min=j;
	}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
	
	for(int i=0;i<length;i++) {
		System.out.print(arr[i]+" ");
}
}
}
