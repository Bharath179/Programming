package demo;

public class ReverseInteger {
public static void main(String[] args) {
	int a=123;
	int n=a;
	int i=0,j=0;
	while(n>0) {
		i=n%10;
		j=(j*10)+i;
		n=n/10;	
	}
	System.out.println(j);
}
}
