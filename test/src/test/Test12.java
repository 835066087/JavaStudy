package test;

public class Test12 {
	
	public static void main(String[] args) {
		System.out.println(f(3));
		
	}
	
	
	public static long f(int n) {
		if(n==1) {
			return 1;
		}else if(n > 1) {
			return n + f(n-1);
		}
		return 0;
	}
}
