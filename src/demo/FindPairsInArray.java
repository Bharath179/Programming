package demo;

public class FindPairsInArray {
	public static void main(String[] args) {
int arr[]= {2,7,11,27};
int sum=9;

 int low=0;
 int high=arr.length-1;


while(low < high) {
	if(arr[low]+arr[high]>sum) {
		high--;
}
	else if(arr[low]+arr[high]<sum) {
	low++;
}
	else if(arr[low]+arr[high]==sum) {
	System.out.println("Pair["+arr[low]+","+arr[high]+"]");
	low++;
	high--;
}
}
}
}

