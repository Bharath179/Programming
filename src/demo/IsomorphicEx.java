package demo;

import java.util.HashMap;

public class IsomorphicEx {
public static void main(String[] args) {
	String s="foo";
	String t="bar";
	System.out.println(isIsomorphic(s, t));
	
}
public static boolean isIsomorphic(String s,String t) {
    if (s.length() != t.length()) {
        return false; 
    }

    HashMap<Character, Character> hm = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char charS = s.charAt(i);
        char charT = t.charAt(i);

        if (hm.containsKey(charS)) {
            if (hm.get(charS) != charT) {
                return false;
            }
        } 
        else {
        	if (hm.containsValue(charT)) {
                return false;
            }
            hm.put(charS, charT);
        }
    }

    return true; 
}
}

