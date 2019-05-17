package test;

public class Test8 {
	
	public static void main(String[] args) {
		
		int n = 98765;
		StringBuilder str = new StringBuilder(n + "");
		String str1 = str.reverse().toString();
		int n1 = Integer.parseInt(str1);
		System.out.println(n1);
		
 	}
}
