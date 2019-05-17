package Afternoon;

class A {
	A() {
		System.out.println("A()");
	}

	static {
		System.out.println("A static()");
	}

	{
		System.out.println("A{}");
	}

}

class B extends A{
	B() {
		System.out.println("B()");
	}

	static {
		System.out.println("B static()");
	}

	{
		System.out.println("B{}");
	}
}

public class OrderTest {

	public static void main(String[] args) {

		new B();
	}

}
