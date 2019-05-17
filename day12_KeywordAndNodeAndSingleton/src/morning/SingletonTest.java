package morning;

//两种单例各有其应用范围，可以延后且项目复杂的时候，就懒汉，饿汉适用于简单情境


//饿汉式
//单例：类只有一个对象
//1.封死new，构造器私有化（无法构造对象了）
//2.在类中声明私有的静态引用，指向本类中创建唯一对象(防止null篡改）
//3.在类中提供公共的静态方法，用以获取唯一对象

class Singleton1 {
	//饿汉式单例
	private static Singleton1 only = new Singleton1();// 在类中声明私有的静态引用，指向本类中创建唯一对象
	//保证唯一性
	
	public static Singleton1 getInstance() {// 在类中提供公共的静态方法，用以获取唯一对象
		return only;
	}

	private Singleton1() {// 封死new，构造器私有化（无法构造对象了）

	}
}
/*
 * 懒汉式单例（第一次获取对象时才创建唯一对象）
 * 1.封死new(构造器私有化）
 * 2.声明私有的静态的引用，用于指向本类类型的对象
 * 3.在公共静态方法中，获取对象时，才创建对象
 */

class Singleton2{
	
	private static Singleton2 only;
	
	public static Singleton2 getInstance() {
		if(only == null) {	//第一次获取对象时，才创建唯一对象，only == null，意味着只有第一次才创建)
		new Singleton2();
		}
		return only;
	}
	
	private Singleton2() {
		
	}
}

public class SingletonTest {

	public static void main(String[] args) {

		// Singleton1 s1 = new Singleton1();
		// Singleton1 s2 = new Singleton1();

		// Singleton1 s1 = Singleton1.only;
		// Singleton1 s2 = Singleton1.only;
		// System.out.println(s1 == s2);

		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1 == s2);
	}
}
