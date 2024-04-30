package demo;

import java.util.LinkedHashSet;

public class Duplicates1 {
public static void main(String[] args) {
	String inputString="greeksofgreeks";
	String output=removeDuplicates(inputString);
	System.out.println("orginalString:"+inputString);
	System.out.println("String without duplicates:"+output);
}
public static String removeDuplicates(String s) {
	char[] chars=s.toCharArray();
	LinkedHashSet<Character>charSet=new LinkedHashSet<Character>();
	for(char c:chars) {
		charSet.add(c);
	}
	StringBuilder s1 =new StringBuilder();
	for(Character character:charSet) {
		s1.append(character);
	}
	return s1.toString();
	
}
}
