package myday19_morning;

/*
 * 线程通信的应用、生产者、消费者
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，
 * 店员一次只能持有固定数量的产品(比如:20），如果生产者试图生产更多的产品，
 * 店员会叫生产者停一下，如果店中有空位放产品了再通知生产者继续生产；如果店中没有产品了，
 * 店员会告诉消费者等一下，如果店中有产品了再通知消费者来取走产品。
 * 
 * 
 * 
 * 分析：
 * 1.多线程：生产者、消费者
 * 2.线程安全（共享数据-产品数量）
 * 3.线程通信
 * 
 * 
 */
class Clerk {
	private int productNum;// 产品数量

	public synchronized void addProduct() {

		if (productNum < 20) {
			productNum++;
			System.out.println(Thread.currentThread().getName() + "生产了第" + productNum + "个产品");

			notify();
			
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized void minusProduct() {

		if (productNum > 0) {
			System.out.println(Thread.currentThread().getName() + "消费了第" + productNum + "个产品");	
			productNum--;
			
			notify();
		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Producer implements Runnable {

	private Clerk clerk;// 对象关联，为了共享clerk中的方法和共享数据

	public Producer(Clerk clerk) {// 构造器
		this.clerk = clerk;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "开始生产");

		while (true) {

			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			clerk.addProduct();// 调用了clerk的方法
		}
	}
}

class Consumer implements Runnable {

	private Clerk clerk;

	public Consumer(Clerk clerk) {
		this.clerk = clerk;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "开始消费");

		while (true) {

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			clerk.minusProduct();
		}
	}

}

public class ProducerAndCounsumerTest {

	public static void main(String[] args) {

		Clerk clerk = new Clerk();

		Producer p = new Producer(clerk);
		Consumer c = new Consumer(clerk);

		Thread producer1 = new Thread(p);
		Thread consumer1 = new Thread(c);

		producer1.setName("生产者1");
		consumer1.setName("消费者1");

		producer1.start();
		consumer1.start();

	}
}
