package myday18_morning;

class NumberThread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println("偶数：" + i);
			}
		}
	}
}

class NumberThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println("奇数：" + i);
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		NumberThread1 n1 = new NumberThread1();// 空参构造器
		n1.start();
		NumberThread2 n2 = new NumberThread2();// 空参构造器
		n2.start();
	}

}
