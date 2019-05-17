package code;

import java.io.UnsupportedEncodingException;

public class StringToBinary {
	public static void main(String[] args) {
		String str= "月";
		System.out.println(stringToBinary(str));
		
	}

	public static String stringToBinary(String str) {
		char[] strChar = str.toCharArray();
		String result = "";
		for (int i = 0; i < strChar.length; i++) {
			result += Integer.toBinaryString(strChar[i]);
		}
		return result;

	}

}
