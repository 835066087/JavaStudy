package exception;

/*
 * 
 * 方法覆盖的条件：
 * 1）方法签名要一致，返回值，方法名，参数列表（类型，数量，顺序）
 * 2）子类的覆盖方法的访问控制修饰符要大于等于父类
 * 3）子类中的覆盖方法的抛出的受检异常要小于等于父类的(专指受检异常，非受检异常不会)
 * 4）覆盖方法不能被private，final，static修饰
 * 
 */

class A {

	public void test() throws Exception {
		System.out.println("test");
	}
}

class B extends A {

	@Override
	public void test() throws Exception {
		System.out.println("test2()");
	}
}

public class ExtendsTest {

}
