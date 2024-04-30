package demo1;


public class Sorting {

	public static void main(String[] args) {
		int arr[]= {20,10,5,30,40,50};
		int size=arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("The Second largest element is:"+arr[arr.length-2]);
	}
}
