package demo1;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,1,5,9};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
				System.out.println("Duplicate element in array is:"+arr[i]);
				flag=true;
				}
			}	
		}
		if(flag==false) 
			System.out.println("Duplicate elements not found");
	}
	}

