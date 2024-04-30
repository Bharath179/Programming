package demo;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingOfCharacters {

	public static void main(String[] args) {
		String str="abcabcbb";
		longest(str);
		System.out.println(longest(str));
	}

	public static int longest(String str) {
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		
		int left=0,right=0;
		int n=str.length();
		int len=0;
		while(right<n) {
			if(map.containsKey(str.charAt(right)))
				left=Math.max(map.get(str.charAt(right))+1,left);
			
			map.put(str.charAt(right), right);
			len=Math.max(len, right-left+1);
			right++;
		}
		return len;
	
}
}
