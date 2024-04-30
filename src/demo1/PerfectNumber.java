package demo1;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=28;
		boolean b=isPerfect(n);
		if(b) 
			System.out.println("The given number is Perfect Number");
		else
			System.out.println("The given number is not Perfect Number");
	}

	public static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) 
				sum=sum+i;			
		}
		if(n==sum)
			return true;
		return false;
	}
}
