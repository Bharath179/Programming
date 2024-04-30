package demo1;


public class CountWords {

	public static void main(String[] args) {
		String s="Bharath Kumar Reddy KN";
			int count=1;
			for (int i=0;i<s.length()-1;i++) {
				if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
					count++;
				}
			}
			System.out.println("The number of words is:"+count);
			
//		String words = "One Two Three Four";
//		int countWords = words.split("\\s").length;
//		System.out.println(countWords);
			
	}
}
