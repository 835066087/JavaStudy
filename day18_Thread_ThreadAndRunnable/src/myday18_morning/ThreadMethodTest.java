package myday18_morning;

/*
 * Thread类中的常用方法
 * 1.run() : 将线程要执行的操作声明在run（）；
 * 2.start() : ①启动线程(重点)；②调用当前线程的run方法
 * 3.currentThread（）：静态方法，用于获取当前执行的代码对应的线程
 * 4.getName()/setName() : 获取设置当前现成的名字
 * 5.sleep(long millis) : 让当前线程“睡眠”指定的毫秒数
 * 6.yield()
 * 
 * 
 */

class Thread2 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				
				try {//此处只能try catch，因为子类抛出的错误不能比父类大
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("奇数：" + i);
			}
			if(i % 20 ==0) {
				yield();//释放CPU的执行权
			}
		}
	}
}

public class ThreadMethodTest {
	public static void main(String[] args) {
		Thread2 n1 = new Thread2();// 空参构造器
		n1.start();
	}

}
