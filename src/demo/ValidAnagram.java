package demo;

import java.util.Arrays;

public class ValidAnagram {
public static void main(String[] args) {
	String s="anagram";
	String t="nagaram";
	String s1="rat";
	String t1="car";
	System.out.println(isAnagram( s, t));
	System.out.println(isAnagram( s1, t1));
	
}
public static boolean isAnagram(String s,String t) {
	
	boolean value=false;
	char[]arr1=s.toCharArray();
	char[]arr2=t.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	 
	if(Arrays.equals(arr1, arr2)) {
		return true;
	}
	return value;
}
}
