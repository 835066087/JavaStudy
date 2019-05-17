package code;

public class Prime {

	public static void main(String[] args) {
		
		label:for (int i = 101; i < 1000; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					continue label;
				}
			}
			System.out.println(i);
		}
		
		
		
		
	}
}
