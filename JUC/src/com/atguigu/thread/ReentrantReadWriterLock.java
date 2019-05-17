package com.atguigu.thread;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyQueue {

	private Object obj;

	ReadWriteLock rwLock = new ReentrantReadWriteLock();

	public void readObj() {
		// 上读锁
		rwLock.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + "读出的内容是：" + obj);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 解锁
			rwLock.readLock().unlock();
		}

	}

	public void writeObj(Object obj) {
		// 上写锁
		rwLock.writeLock().lock();
		try {
			this.obj = obj;
			System.out.println(Thread.currentThread().getName() + "写的内容是：" + obj);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 解锁
			rwLock.writeLock().unlock();
		}

	}

}

/**
 * 
 * @Description: 一个线程写入,100个线程读取
 * 
 */
public class ReentrantReadWriterLock {
	public static void main(String[] args) throws InterruptedException {
		// 创建资源对象
		MyQueue mq = new MyQueue();

		new Thread(() -> {
			mq.writeObj("Hello ReadWriteLock!");
		}, "AA").start();

		for (int i = 1; i <= 100; i++) {
			new Thread(() -> {
				mq.readObj();
			}, String.valueOf(i)).start();
		}

	}
}
