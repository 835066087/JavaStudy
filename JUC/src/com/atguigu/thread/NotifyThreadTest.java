package com.atguigu.thread;

class ShareData// 资源类
{
	private int number = 0;// 初始值为零的一个变量

	public synchronized void increment() throws InterruptedException {
		// 判断，这里只能用while，如果用if只判断一次，数值会错,另一种逻辑在NotifyThreadTest1中,但那种逻辑没有解决线程会不断挂起问题
		while (number != 0) {
			this.wait();
		}
		// 干活
		number++;
		System.out.println(Thread.currentThread().getName() + "\t" + number);
		// 通知
		this.notifyAll();
	}

	public synchronized void decrement() throws InterruptedException {
		// 判断
		while (number != 1) {
			this.wait();
		}
		// 干活
		number--;
		System.out.println(Thread.currentThread().getName() + "\t" + number);
		// 通知
		this.notifyAll();
	}
}

/**
 * 
 * @Description: 现在有两个线程， 可以操作初始值为零的一个变量， 实现一个线程对该变量加1，一个线程对该变量减1， 交替，来10轮。
 *
 *               * 笔记：Java里面如何进行工程级别的多线程编写 
 *               1多线程编程模板（套路）-----上 1.1 线程操作资源类 1.2 高内聚 低耦合
 *               2多线程编程模板（套路）-----下 2.1 判断 2.2 干活 2.3 通知
 * 
 */
public class NotifyThreadTest {
	public static void main(String[] args) {
		// 创建资源对象
		ShareData shareData = new ShareData();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					shareData.increment();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "AA").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					shareData.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "BB").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					shareData.increment();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "CC").start();
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					shareData.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "DD").start();
	}
}

/*
 * 3防止虚假唤醒用while
 * 
 */
