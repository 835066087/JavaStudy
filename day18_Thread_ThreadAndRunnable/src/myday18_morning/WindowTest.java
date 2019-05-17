package myday18_morning;

//例题：开启三个窗口售票，总票数为100张

//此时出现重票，为线程安全问题，待解决

class Window1 extends Thread {

	public static int ticket = 100;// 总数目必须是静态，否则为300张票，因为创建了3个对象
	public static Object obj = new Object();

	@Override
	public void run() {

		while (true) {

			synchronized (obj) {// 此时如果用this，显然是错误的，因为不唯一
				// synchronized(Window1.class){//反射Class c = Window1.class
				if (ticket > 0) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Window1.currentThread().getName() + "售票，票号为" + ticket);
					ticket--;

				} else {
					break;
				}
			}
		}
	}
}

public class WindowTest {
	public static void main(String[] args) {
		Window1 w1 = new Window1();
		Window1 w2 = new Window1();
		Window1 w3 = new Window1();

		w1.setName("窗口1");
		w2.setName("窗口2");
		w3.setName("窗口3");

		w1.start();
		w2.start();
		w3.start();

	}
}
