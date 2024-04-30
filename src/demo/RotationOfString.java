package demo;

public class RotationOfString {
public static void main(String[] args) {
	String s1="abcd";
	String s2="bcda";
	
	if(rotationString(s1,s2)) {
		System.out.println("Rotation of string is found");
	}else {
		System.out.println("Rotation of string is not found");
	}
	
}
public static boolean rotationString(String s1,String s2) {
	return(s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1);
}
}
