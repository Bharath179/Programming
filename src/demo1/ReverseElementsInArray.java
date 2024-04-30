package demo1;

import java.util.Stack;

public class ReverseElementsInArray {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)stack.pop();
			System.out.print(arr[i]);
		}
		
	}
}
