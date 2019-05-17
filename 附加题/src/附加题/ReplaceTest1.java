package 附加题;

import java.util.HashMap;//这两个import，你就知道这道题折磨我多久了
import java.util.Map;

/*
 * public static String replace(String text, String target, String replace){
	}
	示例：replace(“aabbccbb”, “bb”, “dd”);  结果：aaddccdd
	注意：不能使用String及StringBuffer等类的replace等现成的替换API方法。
 * 
 */
public class ReplaceTest1 {

	public static void main(String[] args) throws Exception {

		System.out.println(replace("aabbccbbb", "bbb", "ddd"));
		System.out.println(replace("abbaaabaaaabb", "1", "cc"));
	}

	public static String replace(String text, String target, String replace) {
		char[] arr = text.toCharArray();
		char[] arr2 = replace.toCharArray();
		int startpoint = 0;

		// 获取target在text中出现的次数及脚标，然后依次替换
		while (true) {
			int index = text.indexOf(target, startpoint);
			if (index != -1) {//如果target在原数组中出现
				for (int i = 0; i < arr2.length; i++) {//将replace的内容写入数组arr中
					arr[index + i] = arr2[i];
				}
				startpoint = index + 1;//开始查找下一个符合条件的
			} else {
				break;
			}
		}
		String str = new String(arr);
		return str.toString();
	}
}
