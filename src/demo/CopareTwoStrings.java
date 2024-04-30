package demo;

public class CopareTwoStrings {
public static void main(String[] args) {
	String str1="Bharath";
	String str2="Bharath";
	boolean isCompare=false;
	
	for(int i=0;i<str1.length();i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			isCompare=false;
			break;
		}
		isCompare=true;
	}
	System.out.println("Both the strings are equal :"+isCompare);
}
}
