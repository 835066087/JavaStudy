package myday17_String;

import org.junit.Test;

/*
 * String：
 * 	内容不可以改变的Unicode字符序列，由char组成
 * 	
 * StringBuilder(StringBuffer) ：可变的字符序列
 * 
 */

public class StringTest {

	@Test
	public void test24() {
		
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);//null

		System.out.println(sb.length());//4

		System.out.println(sb);//null

		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1);//空指针

	}
	
	
	@Test
	public void test23() {
		String str1 = "但是这个练习不太难";
		String str2 = "，主要是让你学会使用insert和append";
		String str3 = "？好的吧，开始做练习了，";

		StringBuilder strB = new StringBuilder(str1);
		strB.append(str2);
		strB.insert(0, str3);
		System.out.println(strB);
	}

	@Test
	public void test22() {
		StringBuilder stringBuilder = new StringBuilder(100);
		StringBuilder stringBuilder1 = new StringBuilder("sacd");
		stringBuilder1.append(200).append(true).append("wanle");
		stringBuilder1.append(true);
		System.out.println(stringBuilder1);
	}

	@Test
	public void test21() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(100);
		stringBuilder.append(false);
		System.out.println(stringBuilder);

		stringBuilder.insert(3, "汉字");
		System.out.println(stringBuilder);
		stringBuilder.reverse();
		System.out.println(stringBuilder);

	}

	@Test
	public void test20() {
		String string = "abcccSSADASDsadAD";
		String string1 = "abCCcSSADASDsadAD";
		System.out.println(string.equals(string1));
		System.out.println(string.equalsIgnoreCase(string1));// 忽略大小写

	}

	// 切割器
	@Test
	public void test19() {
		String string = "abcdefgh,ijklmno,pqrst.uvwxyz";
		String[] split = string.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}

	// 变大写
	@Test
	public void test18() {
		String string = "abcdefghijklmnopqrstuvwxyz";
		String string2 = string.toUpperCase();
		System.out.println(string2);
	}

	// 去除首尾的空白字符（trim）
	// 上网冲浪的时候，输入账号密码的时候，可以消除随手的空格
	@Test
	public void test17() {
		String string = "   abcde   fghijklmnopqr    stuvwxyz";
		String string2 = string.trim();
		System.out.println(string2);
	}

	// 消除字符串中的空格
	@Test
	public void test16() {
		String string = "   abcde   fghijklmnopqr    stuvwxyz";
		String string1 = string.replaceAll(" ", "");
		System.out.println(string);
		System.out.println(string1);
	}

	@Test
	public void test15() {
		String string = "abcdefghijklmnopqrstuvwxyz";
		String string2 = string.replace('a', '$');// 替换字符串中的所有oldchar
		String string3 = string.replaceAll("a", "b");
		System.out.println(string2);
		System.out.println(string3);

	}

	// 部分翻转
	@Test
	public void test14() {
		String string = "abcdefghijklmnopqrstuvwxyz";
		int start = 0;
		int end = 7;
		String string1 = string.substring(start, end);
		String string2 = "";

		for (int i = 0; i < string1.length(); i++) {
			string2 = string1.charAt(i) + string2;
		}
		System.out.println(string2);
	}

	@Test
	public void test13() {
		String string = "abkkcadkakebfkabkskab";
		String string1 = string.substring(10, 18);// [start,end)
		System.out.println(string1);
	}

	@Test
	public void test12() {
		String string = "abkkcadkakebfkabkskab";
		boolean b1 = string.startsWith("ab");
		System.out.println(b1);
	}

	@Test
	public void test11() {
		String string = "abkkcadkakebfkabkskab";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.indexOf("ab") != -1) {
				count++;
			}
		}
		System.out.println(count);
	}

	// 获取一个字符串在另一个字符串中出现的次数
	@Test
	public void test10() {
		String string1 = "abkkcadkakebfkabkskab";
		String string2 = "ab";
		// 获取次数
		int count = 0;
		int startpoint = 0;

		while (true) {
			int index = string1.indexOf(string2, startpoint);
			if (index != -1) {
				count++;
				startpoint = index + 1;
			} else {
				break;
			}

		}
		System.out.println(count);
		// return count;

	}

	@Test
	public void test9() {
		String string = "aabbcsddddassd,还有中文，稳健";
		System.out.println(string.indexOf('d'));// indexOf(String s);indexOf(Char c);
		System.out.println(string.indexOf("d", 10));// indexOf(String s,minIndex)
		System.out.println(string.lastIndexOf('d'));// 从右向左，若没有此数，返回-1
	}

	//小写变大写String做法
	@Test
	public void test8() {
		String string = "aabbcsddddassd,还有中文，稳健";
		String string2 = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch >= 'a' && ch < 'z') {
				ch -= 32;
			}
			string2 += ch;
		}
		System.out.println(string2);
	}

	@Test
	// 小写变大写
	public void test7() {
		String string = "aabbcsddddassd,还有中文，稳健";
		char[] c1 = string.toCharArray();

		for (int i = 0; i < c1.length; i++) {
			if (c1[i] >= 'a' && c1[i] < 'z') {
				c1[i] -= 32;
			}

		}
		String string1 = new String(c1);
		System.out.println(string1);

	}

	// 字符串的翻转
	@Test
	public void test5() {
		char[] arr = { '1', 'a', 'c', '好' };
		String s3 = new String(arr);// 原字符串

		char[] s4 = new char[s3.length()];// 新创建char数组接住数据

		for (int i = 0; i < s3.length(); i++) {// 先进行字符串的遍历
			s4[i] = arr[s3.length() - 1 - i];// 开始反转
		}
		System.out.println(s3);
		String s6 = new String(s4);
		System.out.println(s6);

	}

	//String的反转
	@Test
	public void test6() {
		String string = "123,467,22234";
		String string2 = "";
		for (int i = 0; i < string.length(); i++) {
			string2 = string.charAt(i) + string2;
		}
		System.out.println(string2);
	}

	/*
	 * ̵
	 * 
	 * @Test public void test4() { //字符串的遍历
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @Test public void test2() { String s1 = new String();//地址不一样 // String s1 =
	 * "";
	 * 
	 * String s2 = new String("xxx");
	 * 
	 * char[] arr = {'1','a','c','好'}; String s3 = new String(arr);
	 * System.out.println(s3);
	 * 
	 * String s4 = new String(arr,1,2);//1是开始索引，2是字符数 System.out.println(s4); }
	 * 
	 * 
	 * @Test public void test1() { String string = "abc"; string += 100; string +=
	 * false; System.out.println(string); }
	 */
}
