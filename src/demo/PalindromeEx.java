package demo;

public class PalindromeEx {
public static void main(String[] args) {
	String s="A man, a plan, a canal: Panama";
	//String s="race a car";
	System.out.println(isPalindrome(s));
	
}
public static boolean isPalindrome(String s) {
	
	s=s.toLowerCase().replaceAll("[^A-Z-a-z-0-9]","" );
	int start=0;
	int end=s.length()-1;
	while(start<=end) {
		if(s.charAt(start)!=s.charAt(end)) {
			return false;
		}
		start++;
		end--;
	}
	return true;
}
}
