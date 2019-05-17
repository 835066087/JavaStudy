package 附加题;

public class SumFind {

	public static void main(String[] args) {
		int[] c = {1,2,3,5,6,7,8,9,9,10,11,11,2,3,};
		find(c);
	}

	public static void find(int[] c) {
		int left = 0;
		int right = c.length - 1;
		int mid = (left + right) / 2;
		boolean left1 = false, right1 = false;
		while (left < right) {
			int sum1 = 0, sum2 = 0;
			for (int i = 0; i < mid; ++i) {
				sum1 += c[i];
			}
			for (int i = mid + 1; i < c.length; ++i) {
				sum2 += c[i];
			}
			if (sum1 == sum2) {
				System.out.println(c[mid]);
				return;
			} else if (sum1 > sum2) {
				--mid;
				left1 = true;
				if (right1) {
					break;
				}
			} else {
				++mid;
				right1 = true;
				if (left1) {
					break;
				}
			}
		}
		System.out.println("该数字不存在");
	}
}
