package myday19_morning;

import java.util.concurrent.locks.ReentrantLock;

/*
 * JDK5.0新增
 * 使用Lock锁方式，解决实现问题中的线程安全问题
 * 
 * synchronized与Lock锁的区别
 * 1）synchronized涉及到同步监视器，要求多个线程共用唯一的同步监视器
 * 	  当执行语句结束synchronized对应的一对{}以后，会自动的释放同步监视器，使得其他线程可以操作共享数据
 * 2）Lock锁，提供具体的Lock锁的实现类对象，此对象需要多个线程共享
 * 	  必须手动调用unlock（）方法，才能结束对共享数据的操作，使得其他线程可以操作共享数据
 * 
 * 
 */

class Windows implements Runnable {

	private int ticket = 100;// 这里不加static是因为只创建了一个对象
	Object obj = new Object();

	// 1.实例化Lock
	private ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {

		while (true) {

			try {
				// 2.调用Lock（）
				lock.lock();
				// 需要被同步的代码
				if (ticket > 0) {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);

					ticket--;

				} else {
					break;
				}

			} finally {
				lock.unlock();
			}

		}
	}
}

public class LockImplement {
	public static void main(String[] args) {

		Windows w = new Windows();// 只创建了一个

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();

	}
}
