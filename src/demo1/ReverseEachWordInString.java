package demo1;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String input="Bharath Kumar";
		System.out.println("Orginal String :: "+input);
		
		String output="";
		
		String[] words = input.split(" ");
		for(String word:words) {
			
			String revWord="";
			
			//reverse word
			
			for (int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
			output=output+revWord;
			System.out.print(revWord+" ");
		}
	}
}
