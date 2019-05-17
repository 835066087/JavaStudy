package myday19_morning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}

public class ThreadPoolTest {

	public static void main(String[] args) {
		// 1.调用Executors的newFixedThreadPool(),返回指定线程数量的ExecutorService
		ExecutorService pool = Executors.newFixedThreadPool(10);// 此处创建了10条线程

		ThreadPoolExecutor executor = (ThreadPoolExecutor) pool;
		// 管理的操作
		executor.setCorePoolSize(15);

		// 2.将Runnable实现类的对象作为形参传递给ExecutorService的execute()方法中，开启线程
		// 并执行相关的run()
		executor.execute(new MyThread());
		executor.execute(new MyThread());
		executor.execute(new MyThread());

		// 3.结束线程的使用
		executor.shutdown();
	}
}