package demo1;

public class NoOfDigits {

	public static void main(String[] args) {
		int number=1234567;
		int noOfDigits=0;
		while(number!=0) {
			number=number/10;
			noOfDigits++;
		}
		System.out.println("No of digits is:"+noOfDigits);
	}
}
