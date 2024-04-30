package demo1;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s="java program";
		int index=8;
		char ch='n';
		System.out.println("orginal string="+s);
		s=s.substring(0,index)+ch+s.substring(index+1);
		System.out.println("modified string="+s);
	}
}
