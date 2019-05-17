package day12_HomeWork;

//需求：编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，定义封装这些属性的方法。账号要自动生成。
//编写主类，使用银行账户类，输入、输出3个储户的上述信息。
//考虑：哪些属性可以设计成static属性。

public class Account {

	public static long num = 1000000000000L;
	public static double interestRate = 0.068;// 年利率可以被修改，但是可以是static类型的，因为它可被共享
	public static final double minBalance = 100.0;// 最小余额不可修改，可被共享，因此呗final和static修饰

	private final long account;// 账户自动生成，因此不可被修改,且此处账户为空值，应尽快被赋值
	private int password;
	private double balance;
	
	{
		this.account = num++;//给final属性赋值
	}

	public Account() {// 无参构造器
	}

	public Account(int password, double balance) {
		super();
		this.password = password;
		this.balance = balance;
	}

	public static double getInterstRate() {
		return interestRate;
	}

	public static void setInterstRate(double interstRate) {
		Account.interestRate = interstRate;
	}

	public static double getMinBalance() {
		return minBalance;
	}

	public long getAccount() {
		return account;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", password=" + password + ", balance=" + balance + ", 年利率" + interestRate
				+ ", 最小余额" + minBalance + "]";
	}

}
