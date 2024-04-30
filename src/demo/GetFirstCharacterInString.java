package demo;

public class GetFirstCharacterInString {
 
	public static void main(String[] args) {
		String str="Hi Vasavi how are you";
		split(str);
	}

	private static void split(String str) {
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++) {
			String s =words[i];
			System.out.print(s.charAt(0));
		}
	}
}
