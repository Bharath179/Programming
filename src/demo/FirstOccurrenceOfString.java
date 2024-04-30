package demo;

public class FirstOccurrenceOfString {
public static void main(String[] args) {
	String haystack = "sadbutsad";
	String needle="sad";
	System.out.println(firstOccurrence( haystack,  needle));
	
}
public static int firstOccurrence(String haystack, String needle) {
	return haystack.indexOf(needle);
}
}
