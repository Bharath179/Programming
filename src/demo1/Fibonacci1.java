package demo1;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n fibonacci series are");
		int n=sc.nextInt();
		int f1=0,f2=1,f3=0;
		while(n>0) {
			System.out.println(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
			sc.close();
		}
	}
}
