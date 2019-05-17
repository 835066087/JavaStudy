package com.atguigu.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ShareResource {
	private int number = 1;// 1:A 2:B 3:C

	Lock lock = new ReentrantLock();
	Condition cd1 = lock.newCondition();
	Condition cd2 = lock.newCondition();
	Condition cd3 = lock.newCondition();

	public void print5(int totalLoopNumber) {
		// 上锁
		lock.lock();
		try {
			// 判断
			while (number != 1) {
				cd1.await();
			}
			// 执行
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " 第 " + totalLoopNumber + "轮" + " 打印 " + i);
			}
			number = 2;
			// 通知唤醒
			cd2.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 解锁
			lock.unlock();
		}
	}

	public void print10(int totalLoopNumber) {
		// 上锁
		lock.lock();
		try {
			// 判断
			while (number != 2) {
				cd2.await();
			}
			// 干活
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + " 第 " + totalLoopNumber + "轮" + " 打印 " + i);
			}
			number = 3;
			// 通知
			cd3.signal();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 解锁
			lock.unlock();
		}
	}

	public void print15(int totalLoopNumber) {
		// 上锁
		lock.lock();
		try {
			// 判断
			while (number != 3) {
				cd3.await();
			}
			// 干活
			for (int i = 1; i <= 15; i++) {
				System.out.println(Thread.currentThread().getName() + " 第 " + totalLoopNumber + "轮" + " 打印 " + i);
			}
			number = 1;
			// 通知
			cd1.signal();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 解锁
			lock.unlock();
		}
	}
}

/**
 * 
 * @Description: 多线程之间按顺序调用，实现A->B->C 三个线程启动，要求如下：
 *               AA打印5次，BB打印10次，CC打印15次 接着 AA打印5次，BB打印10次，CC打印15次 ......来10轮
 *               
 */
public class ThreadOrderAccess {
	public static void main(String[] args) {
		// 创建资源对象
		ShareResource sr = new ShareResource();

		new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				sr.print5(i);
			}
		}, "AA").start();

		new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				sr.print10(i);
			}
		}, "BB").start();

		new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				sr.print15(i);
			}
		}, "CC").start();
	}
}
