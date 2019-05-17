package myday14_morning;

public class TestWeek {
	
	public void printWeek1(Week1 week) {
		switch (week) {
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
	}
}
