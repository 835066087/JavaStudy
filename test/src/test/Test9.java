package test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test9 {
	public static void main(String[] args) {
		String content = "中中国55kkfff";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		//牛逼
		while (content.length() > 0) {
			
			Character c = content.charAt(0);//牛逼
			content = content.substring(1);//牛逼
			Integer count = map.get(c);
			//返回值为null或数值
			
			if (count == null) {
				map.put(c, 1);
			} else {
				map.put(c, count + 1);
			}
		}
		//牛逼结束了
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
