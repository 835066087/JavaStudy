package day01_sum;

public class IntoRoman {

	/*
	 * 字符 数值 I 1 V 5 X 10 L 50 C 100 D 500 M 1000
	 */

	public static void main(String[] args) {
		System.out.println(inToRoman(6));
	}

	public static String inToRoman(int num) {
		int values[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String reps[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		String res = "";
		for (int i = 0; i < 13; i++) {
			while (num >= values[i]) {
				num -= values[i];
				res += reps[i];
			}
		}
		return res;
	}
}
