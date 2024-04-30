package demo1;

public class RepeatingEleInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,5,1,4,2};
		int temp[]=new int[arr.length];
		
		for(int i=0;i<temp.length;i++) {
			if(temp[arr[i]]==1) {
				System.out.println(arr[i]);
			}
			else {
				temp[arr[i]]++;
			}
		}
	}
}
