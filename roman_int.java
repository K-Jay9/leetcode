package solutions_leetcode;

import java.util.HashMap;
import java.util.Map;

public class roman_int {
	public int romanToint(String s) {
		
		Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
		
		dictionary.put('I', 1);
		dictionary.put('V', 5);
		dictionary.put('X', 10);
		dictionary.put('C', 100);
		dictionary.put('L', 50);
		dictionary.put('D', 500);
		dictionary.put('M', 1000);
		
		s = s.replaceAll("IV", "IIII");
		s = s.replaceAll("IX", "VIIII");
		s = s.replaceAll("XL", "XXXX");
		s = s.replaceAll("XC", "LXXXX");
		s = s.replaceAll("CD", "CCCC");
		s = s.replaceAll("CM", "DCCCC");
		
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			res += dictionary.get(s.charAt(i));
		}
		
		
		return res;
	}

}
