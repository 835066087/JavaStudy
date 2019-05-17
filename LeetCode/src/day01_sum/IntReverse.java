package day01_sum;

public class IntReverse {

	public static void main(String[] args) {
		System.out.println(reverse(1380));

	}

	public static int reverse(int x) {
		int rev = 0;
		while (x != 0) {

			int pop = x % 10; // 余数 0 8 3 1

			x /= 10; // 138 13 1 0

			// 限制长度的部分
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;

			rev = rev * 10 + pop;
		}
		return rev;

	}
}
