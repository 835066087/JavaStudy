package myday18_afternoon;

/*
 *创建多线程的方式二：实现runnable接口的方式
 *1.创建一个实现Runnable接口类
 *2.实现Runnable接口中的抽象方法:操作，将创建的线程要执行的操作声明在此方法中
 *3.创建Runnable接口实现类的对象
 *4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 *5.调用Thread类中的start（）-------调用了Runnable接口的run方法
 *
 *对比两种创建多线程的方式
 * 1.实现Runnable方式优于继承Thread方式
 * （1）Java类的单继承性的局限性；
 * （2）实现Runnable接口的方式更适合处理多个线程有共享数据的问题
 * 2.联系：public class Thread implements Runnable
 * 	      此时实现的Runnable接口的方式就是静态代理模式
 * 3.共同点：继承的方式、实现的方式都是重写Runnable中的run方法，调用start启动线程
 * 
 */

class Numprint implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		Numprint num = new Numprint();
		Thread t1 = new Thread(num);
		t1.start();
	}
}
