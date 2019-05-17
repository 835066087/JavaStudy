package test;

public class test13 {
	public static void main(String[] args) {
		String str = null;
		StringBuffer sb = new StringBuffer();
		sb.append(str);//null

		System.out.println(sb.length());//4

		System.out.println(sb);//null

		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1);//NullPointerException

	}
}
