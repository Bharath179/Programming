package demo;

public class RepeatedSubStringPattern {
public static void main(String[] args) {
	String s="abcabcabcabc";
	System.out.println(repeatedSubstringPattern(s));
}
public static boolean repeatedSubstringPattern(String s) {
	return(s+s).substring(1, 2*s.length()-1).contains(s);
	/*int n=s.length();
	for(int l=n/2;l>0;l--) {
		if(n%2==0) {
			int i=0;
			while(i+l<n && s.charAt(i)==s.charAt(i+l))
				i++;
			if(i+l==n) {
				return true;
			}
		}
	}
	return false;*/
}
}
