package afternoon;

public class MyDateTesT {
	
	
	
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2019,3,27);
		MyDate d2 = new MyDate(2019,3,27);
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		//打印对象时，会自动调用对象的toString方法
		//字符串拼接的时候也会自动调用
	}
}

//