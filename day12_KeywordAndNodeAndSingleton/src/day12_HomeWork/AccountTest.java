package day12_HomeWork;

public class AccountTest {

	public static void main(String[] args) {

		Account[] accArr = new Account[3];//利用数组，便于管理对象

		for (int i = 0; i < accArr.length; i++) {//初始化赋值数组中的元素
			int password = (int) (Math.random() * 100000 + 100000);//随机生成六位数密码
			int balance = (int) (Math.random() * 10000 + 10000);//随机初始化余额，实际操作中不可

			accArr[i] = new Account(password, balance);//将随机数写入各对象中

		}

		System.out.println(accArr[0]);//打印输出
		System.out.println(accArr[1]);
		System.out.println(accArr[2]);

	}
}
