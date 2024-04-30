package demo1;

public class FirstCharacterOfWord {

	public static void main(String[] args) {
		String s="Bharath Kumar Reddy";
		splitWords(s);
	}

	public static void splitWords(String s) {
		String words[]=s.split(" ");
		for (int i = 0; i < words.length; i++) {
			String str=words[i];
			System.out.print(" "+str.charAt(0));
		}
	}
}
