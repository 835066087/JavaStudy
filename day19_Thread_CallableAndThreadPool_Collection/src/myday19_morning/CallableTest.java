package myday19_morning;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class PrintNum implements Callable {
	// 将线程要执行的操作声明在call中
	@Override
	public Object call() throws Exception {

		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			sum += i;
		}
		return sum;
	}
}

public class CallableTest {

	public static void main(String[] args) {

		PrintNum number = new PrintNum();

		FutureTask futureTask = new FutureTask(number);

		Thread t1 = new Thread(futureTask);
		t1.start();

		try {
			// 获取call的返回值
			int sum = (int) futureTask.get();
			System.out.println(sum);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
