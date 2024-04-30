package demo1;

public class Piglatin {

	public static void main(String[] args) {
		
		String str="EAT";
		String pl=" ";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			char u=Character.toUpperCase(c);
			if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U') {
				if(i==0)
					pl=str+"WAY";
				else
					pl=str.substring(i)+str.substring(0,i)+"AY";
				break;
			}
				
		}
		System.out.println("piglatin word:"+pl);
	}
}
