package demo1;

public class EvenAndOdd {

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,8};
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println("Even "+arr[i]+" ");
			}
			if(arr[i]%2!=0) {
				System.out.println("Odd "+arr[i]+" ");
			}
		}
	}
}
