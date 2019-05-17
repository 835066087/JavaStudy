package com.atguigu.thread;

/*
 * 
 * 存在问题，程序无法结束，因为最后一个wait一直在wait
 * 
 */

class ShareData2 {

	private int number = 0;

	public synchronized void increment() throws InterruptedException {
		
		notify();

		if (number == 0) {
			number++;
			System.out.println(Thread.currentThread().getName() + "\t" + number);
		}

		wait();

	}

	public synchronized void decrement() throws InterruptedException {
		notify();

		if (number == 1) {
			number--;
			System.out.println(Thread.currentThread().getName() + "\t" + number);
		}

		wait();
	}

}

public class NotifyThreadTest1 {

	public static void main(String[] args) {
		ShareData2 sharedata = new ShareData2();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					sharedata.increment();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "AA").start();

		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				try {
					sharedata.decrement();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "BB").start();

		
	}

}
