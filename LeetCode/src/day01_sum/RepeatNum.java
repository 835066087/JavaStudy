package day01_sum;

public class RepeatNum {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-121));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int origin = x;
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			rev = rev * 10 + pop;
		}

		if (rev == origin) {
			return true;
		} else {
			return false;
		}
	}
}
