package myday19_morning;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 *实现callable 创建多线程
 *
 *
 *相较于Runnable的方式，Callable更强大
 *1.call（）方法可以使用throws的方式处理异常
 *2.call（）方法可以有返回值
 *3.可以使用泛型，指定call（）返回值的类型
 *
 * 说明：1.多线程的执行，需要借助futureTask类
 * 		2.call（）方法的执行结果（返回值）需要使用futuretask的get（）方法来获取
 *
 *
 *例题，遍历100以内的自然数，并返回所有自然数的和
 *
 *
 */

class PrintNumber1 implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {

		int sum = 0;

		for (int i = 0; i < 100; i++) {
			System.out.print(i + " ");
			sum += i;
		}
		return sum;
	}

}

public class PrintNumber {
	public static void main(String[] args) {
		
		PrintNumber1 number = new PrintNumber1();
		
		FutureTask futureTask = new FutureTask(number);
		
		Thread t1 = new Thread(futureTask);
		t1.start();
		try {
			int sum = (int) futureTask.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		
	}
}
