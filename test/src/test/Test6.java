package test;

public class Test6 {
	public static void main(String[] args) {
		System.out.println(f(5));
	}

	public static int f(int n) {
		if (n <= 2)
			return n;
		int x = f(n - 1) + f(n - 2);
		return x;
	}
	
	
}
