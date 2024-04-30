package demo1;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
	Stack<String>stack=new Stack<String>();
	String str[]={"Bharath ","KN ","Kumar "};
	for (int i = 0; i < str.length; i++) {
		stack.push(str[i]);
	}
	for (int i = 0; i < str.length; i++) {
		str[i]=stack.pop();
		System.out.print(str[i]);
	}
	}
}
