package myday19_morning;

/*
 * wait() : 一旦执行wait，就使当前线程进入阻塞状态，并释放同步监视器
 * notify() : 唤醒被 wait（）的一个线程
 * notifyAll（） ： 唤醒被wait()的所有线程
 * 
 * 说明
 * 1.wait()。notify()、notifyAll（）三个方法的调用者是同步监视器
 * 	 如果不是，则报错，错误类型IllegalMonitorStateException
 * 2.因而他们只能用于同步方法和同步代码块中
 * 3.这三个方法定义于object类中
 * 
 * 面试题sleep()\wait()有什么异同？
 * sleep是让当前线程睡眠指定秒数
 * wait是是直接进入阻塞状态
 * 
 * 相同点：同样都让线程进入阻塞状态
 * 
 * 不同点：
 * （1）在同步代码块或同步方法中：sleep不释放同步监视器，wait释放同步监视器
 * （2）定义方法所属的结构：sleep是Thread的方法，wait是object的方法
 *   	wait是非静态方法，sleep是静态方法
 * （3）结束阻塞的事迹不同：sleep时间到就自动继续往下执行，而wait需要notify唤醒
 * （4）使用的范围不同：wait只能在同步代码块中用，sleep无此限制
 * 
 * 
 */

class Num implements Runnable {

	int num = 1;

	@Override
	public void run() {

		while (true) {
			synchronized (this) {

				notify();// 省略了this

				if (num <= 100) {

					System.out.println(Thread.currentThread().getName() + ":" + num);
					num++;

				} else {
					break;
				}
				try {
					wait();// ①线程进入阻塞状态 ②释放同步监视器
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class NumberPrint {

	public static void main(String[] args) {

		Num n = new Num();
		Thread t1 = new Thread(n);
		Thread t2 = new Thread(n);

		t1.setName("线程1");
		t2.setName("线程2");

		t1.start();
		t2.start();
	}

}
