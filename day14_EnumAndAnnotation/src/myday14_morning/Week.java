package myday14_morning;

import java.util.Scanner;

enum Week1 {
	MON("心情好"), TUE("心情不错"), WED("心情很差"), THU("心情回升"), FRI("兴高采烈"), SAT("简单的快乐"), SUN("明日的焦急");

	private String feeling;

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	private Week1(String feeling) {
		this.feeling = feeling;
	}

}

public class Week {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int n = scan.nextInt();
		if (n < 0 || n > 7) {
			System.out.println("参数错误，请输入1-7");
			return;
		}

		Week1[] values = Week1.values();
		Week1 w1 = values[n - 1];
		printWeek(w1);

		/*
		 * switch (w1) { case MON: System.out.println("周一"); break;
		 * 
		 * case TUE: System.out.println("周二"); break;
		 * 
		 * case WED: System.out.println("周三"); break;
		 * 
		 * case THU: System.out.println("周四"); break;
		 * 
		 * case FRI: System.out.println("周五"); break;
		 * 
		 * case SAT: System.out.println("周六"); break;
		 * 
		 * case SUN: System.out.println("周日"); break;
		 * 
		 * default: System.out.println("输入错误"); break;
		 * 
		 * }
		 */

	}

	private static void printWeek(Week1 w1) {
		switch (w1) {
		case MON:
			System.out.println("周一");
			break;

		case TUE:
			System.out.println("周二");
			break;

		case WED:
			System.out.println("周三");
			break;

		case THU:
			System.out.println("周四");
			break;

		case FRI:
			System.out.println("周五");
			break;

		case SAT:
			System.out.println("周六");
			break;

		case SUN:
			System.out.println("周日");
			break;

		default:
			System.out.println("输入错误");
			break;
		}
		System.out.println(w1.getFeeling());

	}
}
