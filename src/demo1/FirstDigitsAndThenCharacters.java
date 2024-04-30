package demo1;

public class FirstDigitsAndThenCharacters {

	public static void main(String[] args) {
		String str="No26 Sound";
		String d="",c="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
				d=d+ch;
			else  
				c=c+ch;
		}
		String sen=d+c;
		System.out.println(sen);
			
		}
	}
	

