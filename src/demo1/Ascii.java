package demo1;

public class Ascii {

	public static void main(String[] args) {
		String str="TigeraA";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			System.out.println(c+" "+(int)c);
		}
	}
}
