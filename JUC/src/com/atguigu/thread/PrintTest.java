package com.atguigu.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
   两个线程，一个线程打印1-52，另一个打印字母A-Z打印顺序为12A34B...5152Z,
   要求用线程间通信
 * 
 */

class ShareResource1 {
	private int number = 1; // 1:A,2:B

	Lock lock = new ReentrantLock();
	Condition cd1 = lock.newCondition();
	Condition cd2 = lock.newCondition();

	public void printNumber(int totalLoopNumber) {
		lock.lock();
		try {
			while (number != 1) {
				cd1.await();
			}

			for (int i = 1; i <= 52; i++) {
				if (i == 2 * i + 1) {//条件不对
					number = 2;
					break;
				}
				System.out.println(Thread.currentThread().getName() + "第" + totalLoopNumber + "轮:" + i);
			}
			number = 2;
			cd2.signal();
//			number = 2;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void printChar(int totalLoopNumber) {
		lock.lock();

		try {
			while (number != 2) {
				cd2.await();
			}
			for (int i = 1; i <= 26; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}

			number = 1;
			cd1.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}

public class PrintTest {
	public static void main(String[] args) {
		ShareResource1 shareResource = new ShareResource1();

		new Thread(() -> {
			shareResource.printNumber(26);
		}).start();;

		new Thread(() -> {
			shareResource.printChar(26);
		}).start();;
	}
}
