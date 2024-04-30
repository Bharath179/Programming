package demo1;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
	}
	
	
}
