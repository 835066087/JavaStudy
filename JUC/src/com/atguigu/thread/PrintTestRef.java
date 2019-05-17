package com.atguigu.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Print {
	private static int num = 1;

	public final Lock lock = new ReentrantLock();

	public final Condition printA_ZCondition = lock.newCondition();
	public final Condition print1_52Condition = lock.newCondition();

	// 打印数字的方法
	public void print1_52() {
		lock.lock();
		try {
			for (int i = 1; i < 53; i++) {
				while (num % 3 == 0) {//通过num来进行条件控制，而非通过打印的数字来进行条件控制
					try {
						print1_52Condition.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.print(i + ",");

				num++;

				printA_ZCondition.signal();

			}
		} finally {

			lock.unlock();
		}

	}

	// 打印字母的方法
	public void printA_Z() {

		lock.lock();

		try {
			for (char i = 'A'; i <= 'Z'; i++) {
				
				// 打印字母的方法
				while (num % 3 != 0) {
					try {
						printA_ZCondition.await();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(i);
				// 改条件,唤醒下一个线程
				num++;

				print1_52Condition.signal();

			}
		} finally {
			lock.unlock();
		}

	}

}

public class PrintTestRef {
	public static void main(String[] args) {
		Print print = new Print();

		new Thread(() -> {
			print.print1_52();
		}).start();

		new Thread(() -> {
			print.printA_Z();
		}).start();
	}
}
