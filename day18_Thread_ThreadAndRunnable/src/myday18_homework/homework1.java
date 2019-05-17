package myday18_homework;

//需求：银行有一个账户。
//有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。

class Account implements Runnable {

	int balance = 0;
	int money = 1000;

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {// 存3次，因而i < 3，此处i值太小，虽然是多线程（将i调高测试），但会把存款人1先处理完）
			synchronized (this) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				balance += money;
				System.out.println(Thread.currentThread().getName() + "存款，存款数为" + money + ",余额为" + balance);
			}
		}
	}
}

public class homework1 {

	public static void main(String[] args) {

		Account a = new Account();

		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);

		t1.setName("存款人1");
		t2.setName("存款人2");

		t1.start();
		t2.start();

	}

}
