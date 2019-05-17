package 附加题;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
/*
 * 需求：2、1个字符串中可能包含a-z中的多个字符，字符也可能重复，
 * 例如：String data = “aabcexmkduyruieiopxzkkkkasdfjxjdsdszzzz”;写一个程序，
 * 对于给定一个这样的字符串求出字符串出现次数最多的那个字母以及出现的次数
 * （若次数最多的字母有多个，则全部求出）
 * 
 * 还有bug,若次数最多的字母有多个，我求不出
 * 
 */
public class CharArrTest2 {

	public static void main(String[] args) {

		
		String data = "aabcexmkduyruieiopxzkkkkasdfjxjdsds";
		childChar(data);
	}

	public static void childChar(String data) {
		char[] arr = data.toCharArray();
		TreeMap<Character, Integer> tm = new TreeMap<>();

		// 遍历写入TreeMap,并计算次数
		for (char tmp : arr) {
			Integer i = tm.get(tmp);
			if (i == null) {
				tm.put(tmp, 1);
			} else {
				i++;
				tm.put(tmp, i);
			}
		}
		Set<Character> set = tm.keySet(); // 获取TreeMap的Set
		Iterator<Character> it = set.iterator(); // 遍历迭代，为了获取其next()值
		Character maxKey = it.next();
		int maxValue = tm.get(maxKey);
		while (it.hasNext()) {
			Character k = it.next();
			if (maxValue < tm.get(k)) {
				maxKey = k;
				maxValue = tm.get(k);
			}
		}
		System.out.println("出现次数最多的字符为" + maxKey + ",出现次数为" + maxValue);

	}

	public void childChar1(String data){

		//char[] arr = data.toCharArray
	}
}
