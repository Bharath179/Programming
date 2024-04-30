package demo1;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s="Bharath Kumar Reddy";
		int len=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)==' ') {
				break;
			}else {
				len++;
			}
		}
		System.out.println(len);
	}
}
