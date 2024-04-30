package demo1;

public class RotationString {

	public static void main(String[] args) {
		
         String s1="abcd";
         String s2="bcda";
         
         if(s1.length()!=s2.length()) {
        	System.out.println("It is not a Rotation");
         }
         String s3=s1+s1;
         if(s3.indexOf(s2)!=-1)
        	 System.out.println("Rotation");
         else
        	 System.out.println("Not a Rotation");
	}

	
}
