package demo;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachCharacter {
public static void main(String[] args) {
	String str="bharathkumar";
	Map<Character, Integer> charCount=new HashMap<Character, Integer>();
	for(Character c:str.toCharArray()) {
		if(charCount.containsKey(c)) {
			charCount.put(c, charCount.get(c)+1);
		}else {
			charCount.put(c, 1);
			}
		}
	System.out.println(charCount);
	}
	
}

