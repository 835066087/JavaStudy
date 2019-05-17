package com.atguigu.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//实现Callable的类MyThread
class MyThread implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		Thread.sleep(4000);
		System.out.println(Thread.currentThread().getName() + "  *****come in call");
		return 200;
	}
}

/**
 * 
 * @Description: Callable接口获得多线程
 * @date 笔记结论见最后
 */

public class CallableTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		//创建FutureTask对象，入参Callable的实现类MyThread
		FutureTask<Integer> ft = new FutureTask<Integer>(new MyThread());
		
		//创建新线程
		new Thread(ft, "AA").start();

		FutureTask<Integer> ft2 = new FutureTask<Integer>(new MyThread());
		new Thread(ft2, "BB").start();

		System.out.println(Thread.currentThread().getName() + "------main");

		Integer result = ft.get();
		System.out.println("**********result: " + result);
		Integer result2 = ft2.get();
		System.out.println("**********result2: " + result2);

	}
}

/**
 * 
 * 
 * 在主线程中需要执行比较耗时的操作时，但又不想阻塞主线程时，可以把这些作业交给Future对象在后台完成，
 * 当主线程将来需要时，就可以通过Future对象获得后台作业的计算结果或者执行状态。
 * 
 * 一般FutureTask多用于耗时的计算，主线程可以在完成自己的任务后，再去获取结果。
 * 
 * 仅在计算完成时才能检索结果；如果计算尚未完成，则阻塞 get 方法。一旦计算完成，
 * 就不能再重新开始或取消计算。get方法而获取结果只有在计算完成时获取，否则会一直阻塞直到任务转入完成状态， 然后会返回结果或者抛出异常。
 * 
 * 只计算一次 get方法放到最后
 */
