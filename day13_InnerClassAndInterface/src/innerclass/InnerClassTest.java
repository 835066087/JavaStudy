package innerclass;

class Outer {

	private int id = 10;

	// 成员内部类，普通内部类,非静态内部类
	public class Inner1 {
		private int id = 100;

		// this表示当前类的当前对象
		public void inner1Test() {
			System.out.println(id);// 内部类也是对象关联，内部类关联外部类
			System.out.println(Outer.this.id);// 可以直接访问外部类的非静态成员
		}
	}

	public void outerTest() {
		Inner1 i1 = new Inner1();
		i1.inner1Test();
	}

	// 嵌套类，静态内部类
	public static class Inner2 {

		public static int no = 100;
		private String name;

		public void inner2Test() {
			System.out.println("嵌套类的方法");
		}

	}
}

interface A {
	public void a();
}

class B {
	public void b() {
		System.out.println("B.b()");
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		// 用的最频繁的内部类
		// 匿名内部类,因为没有类名，所以必须在声明时就直接创建对象
		// 多态引用 = new 父类|接口（）{
		// 类体就是父类或接口的实现子类，如果是接口，实现全部抽象方法
		// }
		B b = new B() {
			// 匿名内部类的类体
		};
		b.b();

		A a = new A() {
			// 匿名内部类的类体是new后面的类型的子类
			@Override
			public void a() {
				System.out.println("内部类的实现a");
			}
		};
		a.a();
	}

	public static void main3(String[] args) {
		class Hello {// 普通局部内部类,用的很少
			public void test() {
				System.out.println("Hello");
			}
		}
		;
		new Hello().test();
	}

	public static void main2(String[] args) {
		Outer outer = new Outer();
		outer.outerTest();

		// 直接创建内部类对象，依赖外部类的对象
		Outer.Inner1 oi1 = outer.new Inner1();// 必须通过外部类的对象.new
		oi1.inner1Test();

		Outer.Inner2.no = 1000;
		Outer.Inner2 oi2 = new Outer.Inner2();
	}
}
