package demo;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	String orginal, rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string to reverse");
	 orginal=sc.nextLine();
	 int len=orginal.length();
	 for(int i=len-1;i>=0;i--) {
		 rev=rev+orginal.charAt(i);
	 }
	 System.out.println("Reverse string is:"+rev);
	 sc.close();
}
}
