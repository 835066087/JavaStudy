package day12_HomeWork;

/*此次共有两个单例，其中Singleton1是饿汉式单例，Singleton2为懒汉式单例。
 * 两种单例各有其应用范围，当情况简单的时候，应用饿汉式单例，避免不创建唯一对象，情况复杂的时候，则用懒汉式单例，减少加载时间
 * 
 * 但单例的做法都是一样的，统一分为三个步骤
 * 1.通过构造器私有化封死new，从而在外部无法构造新对象，保证只存在一个对象实例
 * 2.在类中声明私有的静态引用，指向本类中创建的唯一对象
 * （而懒汉式和饿汉式的区别就在于懒汉式第一次获取对象时，才创建唯一对象）
 * 3.在类中提供公共的静态方法，用以获取唯一对象
 */

//饿汉式单例
class Singleton1 {
	// 在类中声明私有的静态引用，指向本类中创建唯一对象，保证唯一性
	private static Singleton1 only = new Singleton1();

	// 在类中提供公共的静态方法，用以获取唯一对象
	public static Singleton1 getInstance() {
		return only;
	}

	// 封死new，构造器私有化
	private Singleton1() {

	}

}

//懒汉式单例
class Singleton2 {
	// 声明类，但不创建对象
	private static Singleton2 only;

	// 在类中提供公共的静态方法，用以获取唯一对象
	public static Singleton2 getInstance() {
		if (only == null) {// 第一次获取对象时，才创建唯一对象
			new Singleton2();
		}
		return only;
	}

	// 封死new，构造器私有化
	private Singleton2() {

	}

}

public class Singleton {
	
	public static void main(String[] args) {
		//进行测试，看是否是单例，如果是，则为true
		Singleton1 s1 = Singleton1.getInstance() ;
		Singleton1 s2 = Singleton1.getInstance() ;
		System.out.println(s1 == s2);
		
		
		Singleton2 s3 = Singleton2.getInstance() ;
		Singleton2 s4 = Singleton2.getInstance() ;
		System.out.println(s3 == s4);
	}
}
