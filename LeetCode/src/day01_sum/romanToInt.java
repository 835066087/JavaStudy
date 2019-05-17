package day01_sum;

import java.util.HashMap;

public class romanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("MMMM"));
	}

	public static int romanToInt(String s) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("IV", 4);
		map.put("V", 5);
		map.put("VI", 6);
		map.put("IX", 9);
		map.put("X", 10);
		map.put("XL", 40);
		map.put("L", 50);
		map.put("XC", 90);
		map.put("C", 100);
		map.put("CD", 400);
		map.put("D", 500);
		map.put("CM", 900);
		map.put("M", 1000);
		int res = 0;
		int i = 0;
		int n = s.length();
		
		while (i < n) {
			if (i < n - 1 && map.containsKey(s.substring(i, i + 2))) {
				res += map.get(s.substring(i, i + 2));
				i += 2;
			} else if (map.containsKey(s.substring(i, i + 1))) {
				res += map.get(s.substring(i, i + 1));
				i += 1;
			}
		}
		return res;
	}
}
