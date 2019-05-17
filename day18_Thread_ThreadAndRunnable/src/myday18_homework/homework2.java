package myday18_homework;

class Account1 {

	private double balance;

	public synchronized void deposit(int amt) {
		if (amt > 0) {
			balance += amt;
			System.out.println(Thread.currentThread().getName() + "存钱，当前余额为" + balance);
		}
	}
}

class Customer extends Thread {

	Account1 acct;

	public Customer(Account1 acct) {
		this.acct = acct;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acct.deposit(1000);
		}
	}
}

public class homework2 {

	public static void main(String[] args) {

		Account1 acct = new Account1();

		Customer c1 = new Customer(acct);
		Customer c2 = new Customer(acct);

		c1.setName("甲");
		c2.setName("乙");
		
		c1.start();
		c2.start();
	}
}
