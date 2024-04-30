package demo1;

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithOutRepeatingCharacters {

	public static void main(String[] args) {
		String s="abcabcbb";
		int start=0;
		int end=0;
		int maxlength=0;
		List<Character>list=new ArrayList<Character>();
		while(end<s.length()) {
		if(!list.contains(s.charAt(end))) {
			list.add(s.charAt(end));
			end++;
			maxlength=Math.max(maxlength, list.size());
		}
		else {
			list.remove(Character.valueOf(s.charAt(start)));
			start++;
		}
	}
		System.out.println("Maximum length of longest substring is:"+maxlength);
	}
}
