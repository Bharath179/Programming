package demo1;

public class Count {

	public static void main(String[] args) {
		String str="Bharath Kumar";
		int count =0;
		char ch='a';
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i))
				count++;
		}
		System.out.println(count);
	}
}
