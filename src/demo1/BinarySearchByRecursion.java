package demo1;

public class BinarySearchByRecursion {

	public static void main(String[] args) {
	        int[] arr = {10,20,30,40,50,60,70,80};
	        int target = 30;
	 
	        System.out.println("The element found at index:"+binarySearch(arr, target));
	        
	    } 
	 
	    // Binary search using recursion
	     public static int binarySearch(int[] arr, int target) {
	        return binarySearchRecursive(arr, target, 0, arr.length - 1);
	    }
	 
	    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
	        if (low > high) {
	            return -1; // Element not found
	        }
	 
	        int mid = (low + high) / 2;
	 
	        if (arr[mid] == target) {
	            return mid; // Element found at mid index
	        } else if (arr[mid] > target) {
	            // Search in the left half
	            return binarySearchRecursive(arr, target, low, mid - 1);
	        } else if(arr[mid] < target){
	            // Search in the right half
	            return binarySearchRecursive(arr, target, mid + 1, high);
	        }
			return mid;
	    }
	}