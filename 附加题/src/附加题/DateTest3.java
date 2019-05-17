package 附加题;

import java.util.Date;

public class DateTest3 {

	/*
	 *
	 * 3、假设日期段用两个6位长度的正整数表示，例如：(201401，201406)用来表示2014年1月到2014年6月，求两个日期段的重叠月份数。例如：输入
	 * ：201401和201406， 201403和201409，输出：4 解释：重叠月份：3,4,5,6月共4个月 取在两者中的交集
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int a[] = { 201401, 201406 };
		int b[] = { 201403, 201409 };
		System.out.println(getMatchedMonth(a, b));
	}

	public static int getMatchedMonth(int[] a, int[] b) {
		int min = Math.min(a[0], b[0]);
		int max = Math.max(a[1], b[1]);
		int monthDif = 0;
		for (int i = min; i <= max; ++i) {
			if (i >= a[0] && i <= a[1] && i >= b[0] && i <= b[1]) {
				monthDif++;
			}
		}

		return monthDif;
	}
}
