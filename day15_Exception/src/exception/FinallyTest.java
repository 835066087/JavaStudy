package exception;

public class FinallyTest {

	@SuppressWarnings("finally")
	public static int test() {
		int n = 10;
		try {
			return n;
		} finally {
			n++;
			System.out.println("无论发生什么，都要执行");
			return n;//如果没有此处的return，则n为10，如果有此处return，
		}
	}

	public static void main(String[] args) {
		System.out.println(test());
	}

}
