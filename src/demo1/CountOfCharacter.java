package demo1;

import java.util.Scanner;

public class CountOfCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		System.out.println("Enter Character:");
		char c=sc.next().charAt(0);
		int occurance=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c)
				occurance++;
		}
		System.out.println("Number of occurance of char:"+c+":is:"+occurance);
		sc.close();
	}
}
