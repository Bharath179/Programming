package demo1;

import java.util.Scanner;

public class CountOfRepeatedWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String[] words = str.split(" ");
		int count;
		for (int i=0;i<words.length;i++)
		{
			count=1;
		
		for (int j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
				count=count+1;
				words[j]="0";
			}
		}
		if(words[i]!="0") {
			System.out.println(words[i]+" "+count);
			sc.close();
		}
	}
}
}
