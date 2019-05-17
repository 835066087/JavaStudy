package 附加题;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Print{
	private int num = 1;
	Lock lock = new ReentrantLock();
	Condition c1 = lock.newCondition();
	Condition c2 = lock.newCondition();
	
	public void printOdd() {
		lock.lock();
		for (int i = 1; i <= 10000; i++) {
			while(num % 10 == 0) {
				
			}
		}
	}
	
	public void printEven() {
		
	}
}



public class ThreadTest4 {

}
