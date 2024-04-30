package demo;

public class OccuranceOfCharacter {
public static void main(String[] args) {
	String str="Bharath";
	int count =str.length()-str.replace("a", "").length();
	System.out.println("Number of occurances of 'a'in :"+str+"="+count);
}
}
