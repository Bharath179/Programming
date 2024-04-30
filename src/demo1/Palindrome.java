package demo1;

public class Palindrome {

	public static void main(String[] args) {
		int a=151;
		int n=a;
		int i=0,j=0;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j) {
			System.out.println("The given no is palindrome");
		}else {
			System.out.println("The given no is not palindrome");
		}
	}
}
