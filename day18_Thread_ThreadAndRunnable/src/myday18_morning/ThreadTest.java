package myday18_morning;

/*
 * 创建多线程的第一种方式：继承Thread
 * 
 * 1.创建一个继承于Thread的子类
 * 2.重写Thread类的run方法,将此线程要执行的操作，声明在run中
 * 3.创建Thread子类对象
 * 4.调用此对象的start（）；①启动线程；②调用当前线程的run方法
 * 
 * 
 * 例题：创建一个线程，用于遍历100内所有的偶数
 * 
 * 
 * 
 * /*
 * Thread类中的常用方法
 * 1.run() : 将线程要执行的操作声明在run（）；
 * 2.start() : ①启动线程(重点)；②调用当前线程的run方法
 * 3.currentThread（）：静态方法，用于获取当前执行的代码对应的线程
 * 4.getName()/setName() : 获取设置当前线程的名字
 * 5.sleep(long millis) : 让当前线程“睡眠”指定的毫秒数
 * 6.yield() : 释放当前CPU的执行权
 * 7.join() : 在线程A中调用线程B的join（）表示，一旦执行此方法，则线程A阻塞，只有B执行完毕，才结束
 * 8.isAlive() : 判断当前线程是否还存活
 * 
 * 线程的优先级的方法
 * 9.getPriortity() : 获取线程的优先级
 * 10. setPriority（） ： 设置线程的优先级
 * 
 * 当没有显式设置线程的优先级时，此时优先级默认为5，最小是1，最大是10
 * 高优先级的线程要抢占低优先级的线程的资源，并不意味着高优先级现成的执行一定早于低优先级
 * 只是从概率上说，高优先级以更大概率早于低优先级
 * 
 * 
 */
class NumberThread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {

				try {// 此处只能try catch，因为子类抛出的错误不能比父类大
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("偶数：" + i);
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		NumberThread n1 = new NumberThread();// 空参构造器
		n1.setPriority(Thread.MAX_PRIORITY);
		n1.start();

		// 可以创建Thread类的匿名子类的匿名对象
		/*new Thread() {
			public void run() {
				for (int i = 1; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println("偶数：" + i);
					}
				}
			}
		}.start();*/

		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println("奇数：" + i);
			}
		}
	}
}
