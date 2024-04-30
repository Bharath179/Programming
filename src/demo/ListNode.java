package demo;

public class ListNode {

    
private int val;
private ListNode next;

public ListNode(int i) {
}
public static ListNode partitionList(ListNode head,int x) {
ListNode smallerHead=new ListNode(0),smaller=smallerHead;
ListNode biggerHead=new ListNode(0),bigger=biggerHead;
while(head!=null) {
	if(head.val<x) {
		smaller.next=head;
		smaller=smaller.next;
	}else {
		bigger.next=head;
		bigger=bigger.next;
	}
	head=head.next;
}
bigger.next=null;
smaller.next=biggerHead.next;
return smallerHead.next;
}
}
