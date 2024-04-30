package demo;

public class ReverseStringEx {
public static void main(String[] args) {
	String s="hello";
	char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		System.out.print(s.charAt(i)+ " ");
	}
}
}
	
	

