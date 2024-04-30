package demo;

public class ReverseStringByUsingRecursion {
public static void main(String[] args) {
 String s="Bharath";
	System.out.println(recursiveString(s));
}
public static String recursiveString(String s) {
	if(s==null || s.length()<=1) {
		return s;
	}
	return recursiveString(s.substring(1))+s.charAt(0);
	
}
}
