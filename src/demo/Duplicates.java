package demo;

public class Duplicates {
	
	public static String removeDuplicates(String s) {
		 
	    String s1 = "";
	    for (int i = 0; i < s.length(); i++) {
	      int j = 0;
	      for (j = 0; j < i; j++) {
	        if (s.charAt(i) == s.charAt(j))
	        {
	          break;
	        }
	      }
	      if (i == j) {
	        s1 += s.charAt(i);
	      }
	    }
	    return s1;
	  }
	  public static void main(String[] args) {
	    String str = "greeksofgreeks";
	    System.out.println("Original String: "+str);
	    System.out.println("After removing duplicates: "+removeDuplicates(str));
	 
	  }
}
