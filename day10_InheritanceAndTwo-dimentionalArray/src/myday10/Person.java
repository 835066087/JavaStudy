package myday10;

/*继承：从现有类创建子类，现有类就称为父类，基类，超类
 * 子类继承父类的所有成员（构造器除外）
 * 父类中的私有成员，也会被子类继承，但是不能在子类中直接访问，必须让父类提供公共的get/set方法，在子类通过方法间接访问私有成员
 * 
 * 方法覆盖（override）
 * 子类中重写从父类继承的方法
 * 
 * 条件
 *覆盖方法必须和被重写方法具有相同的方法名、参数列表和返回值类型（方法签名一致）
 *在访问权限上，覆盖方法不可用比被覆盖方法更严格的访问权限——否则会将父类缩小
 *覆盖和被覆盖方法必须同时为非static的
 *子类异常不能大于父类被重写方法的异常
 *
 * 
 * 访问控制修饰：控制访问范围，同类，同包，不同包子类
 * public        任意
 * protected     同类      同包   子类
 * default       同类	  同包
 * private       同类
 * 
 * 关于构造器
 * 最重要
 * 1）所有类都必须有构造器
 * 2）子类构造器中必须有先对父类构造器的调用！
 * 
 * 
 * 创建子类对象，父类构造器也参与,
 * 子类构造器中默认都有对父类的无参构造器的调用，并且必须是第一行
 * javabean必须有公共无参构造器
 * 
 * 子类构造器中必须有对父类构造器的调用！
 * 在子类构造器中，第一行必须是this(...)或者super(...)其中之一
 * this(...)效果是间接调用父类构造
 * super(...)效果是直接调用父类构造
 * 
 * 
 * 
 */

public class Person {
	
	String name;
	int age;
	String gender;
	
	public void eat(String something) {
		System.out.println("吃" + something);
	}
	
	public String say() {
		return"姓名" + name +"，年龄："  + age +",性别" + gender;
	}
}
