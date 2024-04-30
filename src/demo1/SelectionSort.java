package demo1;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {64,25,12,22,11};
		int length=arr.length;
		for (int i=0;i<length-1;i++) {
			for (int j =i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i=0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
