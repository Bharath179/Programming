package demo;

public class Penagram {

	public static void main(String[] args) {
		String s="The quick brown fox jumps over the lazy dog";
		isPanagram(s);
		System.out.println(isPanagram(s));
	}

	public static boolean isPanagram(String s) {
		if(s.length()<26) {
			return false;
		}else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
		}
		return true;
	}
}
