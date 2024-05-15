package demo2;

public class Sorting {

	public static void main(String[] args) {
		int arr[]= {9,7,5,6,3,2};
		int length=arr.length;
		for(int i=0;i<=length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}
