package demo1;

public class BinarySearchWithoutRecursion {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,12};
		boolean flag=false;
		int key=12;
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element found at index:"+mid);
				flag=true;
				break;
			}
			if(arr[mid]>key) {
				high=mid-1;
			}
			if(arr[mid]<key) {
				low=mid+1;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}
