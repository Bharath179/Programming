package demo1;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		boolean flag=false;
		int searchable_ele=50;
		for (int i=0; i< arr.length;i++) {
			if(searchable_ele==arr[i]) {
				System.out.println("Element found at index:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}
	}
}
