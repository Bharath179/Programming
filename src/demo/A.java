package demo;


public class A {
public static void main(String[] args) {
	String s="uday kumar";
	String s1="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(i=='a' && count==2) {
			s1=s1+'b';
		}else {
			s1=s1+i;
		}
		if(i=='a') {
			count++;
			//System.out.println(s1);
		}
		System.out.println(s1.charAt(i));
	}
	//System.out.println(s1.charAt(i));
}
}
