package myday18_afternoon;
/*
 * 1.出现了线程的安全问题，卖票的时候出现了重票和错票
 * 2.当其中一个线程在操作共享数据的过程中，还未操作完的情况下，其他线程就参与进，导致了线程的安全问题
 * 3.如何避免，必须保证一个线程操作完共享数据后，其他线程才能继续操作
 * 
 * 
 * 4.java如何解决线程安全问题
 * 使用同步机制
 * 方法一：同步代码块
 * 
 * synchronized（同步监视器）{
 * 		//需要被同步的代码
 * }
 * 
 * 说明：1.需要被同步的代码，操作共享数据的代码
 * 		2.共享数据：多个线程共同操作的数据，比如，ticket；
 * 		3.同步监视器，俗称锁。要求：①任何一个类的对象都可以充当同步监视器
 * 						        ②多个线程必须共用同一个同步监视器
 * 别包多，也别包少，包多了只执行一个线程，包少了解决不了线程安全问题
 * 注意：使用同步代码块解决Runnable接口中的线程安全问题，可以考虑使用：this
 * 		使用同步代码块解决继承Thread类中的线程安全问题，慎用this
 * 
 * 
 * 
 * 方法二：同步方法
 * 	如果操作共享数据的代码，完整的声明在了某一个方法内，我们可以考虑将此方法声明为公共方法 
 * 
 * 非静态的方法，如果声明为同步方法，此时默认的同步监视器是this
 * 静态方法，如果声明为同步方法，此时默认的同步监视器是，当前类本身
 * 
 *
 * 
 * 
 * 方式三：jdk5.6新增：lock锁
 * 
 * 
 * 5.使用同步来处理线程安全问题的弊端？
 *   操作共享数据的过程其实是单线程，效率较低s
 * 
 * 
 */

class Windows implements Runnable {

	int ticket = 100;// 这里不加static是因为只创建了一个对象
	Object obj = new Object();

	@Override
	public void run() {

		while (true) {

			synchronized (this) {//this为当前对象
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "售票，票号为" + ticket);

					ticket--;

				} else {
					break;
				}
			}
		}
	}
}

public class WindowTest1 {
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
