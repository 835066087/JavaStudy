package 附加题;

public class ReplaceTest_good {

	public static void main(String[] args) {
		System.out.println(replace("aabbccbbb", "bbb", "ddd"));
		System.out.println(replace("abbaaabaaaabb", "1", "cc"));
	}

	public static String replace(String s1, String s2, String s3) {
		char[] c = s1.toCharArray();
		if (!s1.contains(s2)) {
			return "字符串中不存在可替换的字符串";
		}
		for (int i = 0; i < s1.length() && (i != s1.length() - 1);) {// 关键
			i = s1.indexOf(s2, i);// 迭代语句和脚标处理
			if (i == -1)
				return String.copyValueOf(c);//一行不用做处理
			for (int j = 0; j < s3.length();) {
				c[i++] = s3.charAt(j++);
			}
		}
		return String.copyValueOf(c);
	}
}
