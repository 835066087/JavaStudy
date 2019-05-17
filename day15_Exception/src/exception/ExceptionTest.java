package exception;

//自定义异常，写一个类，继承自Exception
//这是一个受检异常
class DividedByZeroException extends Exception {

	public DividedByZeroException(String message) {
		super(message);
	}

	public DividedByZeroException(Throwable cause) {
		super(cause);
	}
}

public class ExceptionTest {

	public static int divide(int x, int y) throws DividedByZeroException {
		int z = 0;
		try {
			z = x / y;
		} catch (ArithmeticException e) {
			throw new DividedByZeroException(e);
		}
		return z;
	}

	public static void main(String[] args) {
		System.out.println("main begin");

		try {
			System.out.println(divide(100, 5));
			System.out.println(divide(100,0));
			
		} catch (DividedByZeroException e) {
			e.printStackTrace();
		}

		System.out.println("main end");
	}
}

class ExceptionTest3 {

	public static int divide(int x, int y) throws DividedByZeroException {
		if (y == 0) {
			throw new DividedByZeroException("除数为0错误");
		}
		return x / y;
	}

	public static void main(String[] args) { // throws DividedByZeroException {//可以抛，但不要抛,可以用try
		System.out.println("main start");
		try {
			System.out.println(divide(100, 20));
			System.out.println(divide(100, 0));
		} catch (DividedByZeroException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}
}

class ExceptionTest2 {
	public static int divide(int x, int y) {
		if (y == 0) {
			// throw 异常对象,throw语句一旦执行，后面的语句就不能执行了，相当于return
			throw new RuntimeException("除数为0错误！！");
		}
		int z = x / y;
		return z;
	}

	public static void main(String[] args) {
		System.out.println("main begin");

		try {
			System.out.println(divide(100, 20));
			System.out.println(divide(100, 0));
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("main end");
	}
}

class ExceptionTest1 {

	public static void main(String[] args) {

		System.out.println("main start");

		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			System.out.println(n1 / n2);

		} catch (ArrayIndexOutOfBoundsException ex) {// 越界
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		} catch (NumberFormatException ex) {// 数据类型错误
			System.out.println(ex.getMessage());
		} catch (ArithmeticException ex) {// 算数错误
			ex.printStackTrace();
		} catch (Exception ex) {// 保底
			System.out.println("其他异常" + ex);
		} finally {
			// 通常在这里释放不在GC区的资源，通常与OS相关
			System.out.println("结束了");
		}

		System.out.println("main end");
	}
}
