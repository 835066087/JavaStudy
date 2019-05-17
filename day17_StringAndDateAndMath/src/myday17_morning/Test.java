package myday17_morning;

public class Test {
	
	public static void main(String[] args) {
		
	
	Integer i = new Integer(1);
	Integer j = new Integer(1);
	System.out.println(i == j);//false new为新对象，因而是比较地址的

	Integer m = 1;
	Integer n = 1;
	System.out.println(m == n);//Integer.valueOf（1);

	Integer x = 128;//Integer.valueOf(-128-127);如果不在这个区间，则新new一个Integer
	Integer y = 128;//new完又比地址，因而false
	System.out.println(x == y);
	}

	
}
