package demo;

public class LengthOfLastWord {
public static void main(String[] args) {
	String s="   fly me   to   the moon  ";
	System.out.println(isLastLength(s));
}
public static int isLastLength(String s) {
	String str[]=s.split(" ");
	return str[str.length-1].length();
}
/*public static int isLastLength(String s) {
	String str=s.trim();
	int count=0;
	for(int i=str.length()-1;i>=0;i--) {
		if(str.charAt(i)!=' ') {
			count++;
		}
		else {
			break;
		}
		
	}
	return count;
}*/
}
