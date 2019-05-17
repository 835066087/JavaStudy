package test;

public class Test10 {
	public static void main(String[] args) {
		System.out.println(f(5));
		
	}
	
	
	public static long f(int n) {
		long result = 1;
		if(n  > 2) {
			return f(n-1) + f(n-2);
		}
		return result;
	}
}
