package demo;

public class LicenceKey {
public static void main(String[] args) {
	String s="2-5g-3-J";
	int k=2;
	System.out.println(licenseKeyFormatting(s, k));
	
}
    public static String licenseKeyFormatting(String s, int k) {
        String res = s.toUpperCase().replaceAll("-", "");
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for (int i = res.length() - 1; i >= 0; i--) {
            sb.append(res.charAt(i));
            if (count == k && i != 0) {
                sb.append("-");
                count = 1;
            } else count++;
        }

        return sb.reverse().toString();
    }
}

