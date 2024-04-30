package demo;

public class CountOfCharacters {
	public static void main(String[] args) {
		String str="Bharath Kumar";
		count(str);
	}
  public static void count(String str) {
	  //converting String into charArray by using toCharArray() method present in string class
	char[] ch=str.toCharArray();
	//Iterating the string using for loop
	for(int i=0;i<ch.length;i++) {
		//Declaring the string with empty initialization
		String s="";
		//when the character is not space
		while(i<ch.length && ch[i]!=' ') {
			//concat with the declared string
			s=s+ch[i];
			i++;
		}
		if(s.length()>0) 
			System.out.println(s+":"+s.length());
	}
  }
}

