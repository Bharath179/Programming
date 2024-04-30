package demo;

public class RotationString {

	public static void main(String[] args) {
		String str="abcd";
		String rotated="bcda";
		System.out.println(isRotated(str,rotated));
	}

	public static boolean isRotated(String str, String rotated) {
		if(str==null || rotated==null) {
			return false;
		}
		else if(str.length()!=rotated.length()) {
			return false;
		}
		else {
			String concatenated=str+str;
			return concatenated.contains(rotated);
		}
		
	}
}
