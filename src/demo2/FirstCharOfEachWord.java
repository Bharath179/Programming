package demo2;

public class FirstCharOfEachWord {

	public static void main(String[] args) {
		String s="Bharath Kumar Reddy";
		String[] words = s.split(" ");
		for(int i=0;i<words.length;i++) {
			String str = words[i];
			System.out.print(str.charAt(0)+" ");
		}
	}
}
