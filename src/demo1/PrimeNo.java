package demo1;

public class PrimeNo {

	public static void main(String[] args) {
		int n=27;
		int count=0;
		for (int i = 1; i<=n; i++) {
			if(n%i==0)
				count++;
		}
		if(count==2) {
			System.out.println("The given no is prime no");
		}else {
			System.out.println("The given no is not prime no");
		}
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
//		boolean flag=false;
//		for (int i = 2; i <=n/2; i++) {
//			if(n%i==0) {
//				flag=true;
//				break;
//			}
//		}
//		if(!flag) {
//			System.out.println("Prime no");
//		}else {
//			System.out.println("Not prime no");
//		}
	}
}
