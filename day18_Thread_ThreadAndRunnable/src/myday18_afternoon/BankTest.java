package myday18_afternoon;

/*
 * 使用同步机制解决单例模式中的懒汉式的线程安全问题
 * 写线程安全的懒汉式
 */

public class BankTest {

}

class Singleton {
	private Singleton() {//私有化构造器
	}

	private static Singleton singleton;//声明私有的静态引用

	
	public static Singleton getInsatance() {

		if (singleton == null) {//第一次才创建对象

			synchronized (Singleton.class) {//保证线程安全
				if (singleton == null) {//再次确认是不是第一次创建对象
					singleton = new Singleton();//创建唯一对象
				}
			}
		}
		return singleton;
	}

}
// 方式一，同步方法
/*
 * public static synchronized Bank getInsatance() {
 * 
 * if (bank == null) { bank = new Bank(); } return bank; }
 */