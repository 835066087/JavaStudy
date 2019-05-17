package day17_homework;

//需求说明：
//模拟一个trim方法，去除字符串两端的空格。
//
//"     dlakjfklja alskdjf laksjdf  ljk     ";

public class HomeWork1 {

	//思路，两个for循环，一个正向遍历一个负向遍历，当遇到第一个非空格元素，弹出循环
	
	public static String trim1(String string) {
		String string1;
		char[] charArr = string.toCharArray();
		for (int i = 0; i < charArr.length; i++) {//正向遍历
			if (charArr[i] == ' ') {//首端空格写0
				charArr[i] = 0;
			} else {//如遇上第一个非空格字符，弹出
				break;
			}
		}
		for (int i = charArr.length - 1; i > 0; i--) {//负向遍历
			if (charArr[i] == ' ') {//尾端空格写0
				charArr[i] = 0;
			} else {//如遇上第一个费空格字符，弹出
				break;
			}
		}

		string1 = new String(charArr);//将重写后的数组写入string
		return string1;//返回string1
	}

	public static void main(String[] args) {
		String string = "     dlakjfklja alskdjf laksjdf  ljk     ";
		String trim1 = trim1(string);
		System.out.println(trim1);
	}

}
