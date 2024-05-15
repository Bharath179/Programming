package demo2;

public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		String rev="";
		int original=str.length();
		for(int i=original-1;i>=0;i--) 
			rev=rev+str.charAt(i);
			if(str.equals(rev)) 
				System.out.println("The given string is palindrome");
			else
				System.out.println("The given string is not palindrome");
			}
		}
		
	

