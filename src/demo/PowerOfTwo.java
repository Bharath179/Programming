package demo;

public class PowerOfTwo {
public static void main(String[] args) {
	int n=3;
	System.out.println(isPowerOfTwo(n));
}
public static boolean isPowerOfTwo(int n) {
	
	while(n!=0) {
		if(n%2!=0) {
			return false;
		}
		else
			return true;
	}
	return false;
}
}
