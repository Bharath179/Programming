package demo;

import java.util.HashMap;

public class WordPattern {
public static void main(String[] args) {
	String pattern="abba";
	String s="dog cat cat dog";
	System.out.println(wordPattern(pattern, s));
}

public static boolean wordPattern(String pattern, String s) {
    String[] word = s.split(" ");
    if(word.length != pattern.length())
    	return false;

    HashMap<Character, String> map = new HashMap<Character, String>();
    for(int i=0; i<pattern.length(); i++){
        char c = pattern.charAt(i);

        if(map.containsKey(c)){
            if(!map.get(c).equals(word[i])){
                return false;
            }
        }else {
            if(map.containsValue(word[i])){
                return false;
            } 
            map.put(c, word[i]);
        }
    }
	return true;
}
}
