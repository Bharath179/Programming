package demo;

import java.util.ArrayList;
import java.util.List;

public class L {

	public static void main(String[] args) {
		String s="abcabcbb";
		int start=0, end=0;
		int maxLength=0;
		List<Character>list=new ArrayList<Character>();
		while(end<s.length()) {
			if(!list.contains(s.charAt(end))) {
				list.add(s.charAt(end));
				end++;
				maxLength=Math.max(maxLength, list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(start)));
				start++;
			}
		}
		System.out.println("maximum length is:"+maxLength);
		}
	}

