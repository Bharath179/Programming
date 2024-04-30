package demo;

public class CountSpecialCharacters {
public static void main(String[] args) {
	String s="hello@#&world";
	int count=0;
	String specialCharacterRemoved="";
	
	for(int i=0;i<s.length();i++) {
		if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
			count++;
		}
		else {
			specialCharacterRemoved=specialCharacterRemoved+s.charAt(i);
		}
	}
	if(count==0) {
		System.out.println("There are no special characters in string");
	}
	else {
		System.out.println("Special characters are found in string:"+count);
	}
	System.out.println("Special characters removed:"+specialCharacterRemoved);
}
}
