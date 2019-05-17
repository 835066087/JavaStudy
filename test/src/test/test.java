package test;

import java.util.Arrays;
import java.util.List;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread m = new MyThread();
		
		Thread t = new Thread(m);
		
		t.start();
		t.join();

		int j = m.i;
		System.out.println(j);

	}

}

class MyThread implements Runnable {
	
	int i;

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		i = 100;
	}
}
