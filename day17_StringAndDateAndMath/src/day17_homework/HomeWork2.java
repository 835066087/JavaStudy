package day17_homework;

//
//需求：
//获取两个字符串中最大相同子串。比如：
//str1 = "abcwerthelloyuiodef";str2 = "cvhellobnm"
//提示：将短的那个串进行长度依次递减的子串与较长的串比较。
//

public class HomeWork2 {

	public static void main(String[] args) {
		childString();
		//childString2();// 这个跑不出来，原因在没从右往左遍历删减，睡醒再改

	}

	public static String childString() {
		String string = "abcwerthelloyuiodef";
		String string2 = "cvhelloobnm";// 长度10
		String string4 = "";
		int n1 = string2.length(), max = 0;
		for (int i = 0; i < n1; i++) {// 获取从左向右逐个递减的字符串

			for (int j = n1; j >= i; --j) {// 获得从右往左逐个递减的字符串
				String string3 = string2.substring(i, j);
				if (string3.length() > max && string.contains(string3)) {
					string4 = string3;
					max = Math.max(max, string3.length());
				}
			}
		}
		System.out.println("最长字符串为：" + string4);
		System.out.println("长度为：" + max);
		return string4;

	}

	public static String childString2() {
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
		int l1 = str1.length();
		int l2 = str2.length();
		String sub2 = str2;
		/*String sub3 = str2;// 倒序sub2
		
		for (int i = 0; i < sub2.length(); i++) {
			sub3 = sub2.charAt(i) + sub2;
		}*/
		int subl2 = l2;
		for (int j = 1; j < l2; j++) {// 用来递减短字符串
			for (int i = 0; i < l1 - subl2; i++) {// 用来比对长短字符串
				sub2 = str2.substring(j,subl2 - i);
				if (sub2.equals(str1.substring(i, i + subl2))) {//问题点
					System.out.println("The longest equally substring is:" + sub2);
					j = l2;
					i = l1;
				}
			}
			sub2 = str2.substring(j, l2 - 1);
		}
		System.out.println("最长字符串为：" + sub2);
		return sub2;
	}

}
