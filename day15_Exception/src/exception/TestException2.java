package exception;

class IlleagalNumberException extends Exception {

	public IlleagalNumberException(String message) {
		super(message);
	}

	public IlleagalNumberException(Throwable cause) {
		super(cause);
	}
}

public class TestException2 {

	public static int divide(int m, int n) throws IlleagalNumberException {// 此处需要警告，否则下方编译不通过
		int z = 0;
		try {
			z = m / n;
		} catch (ArithmeticException e) {
			throw new IlleagalNumberException(e);// 抛出自定义错误
		}

		return z;
	}

	public static void main(String[] args) {// 此处原本需要警告，但是加入try以后不需要，因为try解决了问题

		System.out.println("main start");

		try {
			System.out.println(divide(100, 100));
			System.out.println(divide(100, 0));

		} catch (IlleagalNumberException e) {
			e.printStackTrace();
		}

		System.out.println("main end");
	}

}
