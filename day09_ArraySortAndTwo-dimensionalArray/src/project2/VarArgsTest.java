package project2;

public class VarArgsTest {
	
/*	public static int avg(int a, int b) {
		return((a+b)/2);
	}

	public static int avg(int a, int b,int c) {
		return((a+b+c)/3);
	}*/
	
	public static int avg(int... values) {//...表示个数不确定，可变参数，其必须放在参数列表最后
		int sum = 0;//本质上是数组
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum/values.length;
	}
	
	
	public static void main(String[] args) {
	//public static void main(String... args) 
		System.out.println(avg(3,9));//原理在编译器：avg(new int[]{3,9})
		System.out.println(avg(3,9,3));
		
		int[] arr = {3,2,9,7,8,9,10};
		System.out.println(avg(arr));//也可以接受数组作为参数
		//System.out.println(avg());//参数也可以为空，除0错误，avg(new int[]{})
		//System.out.println(avg(null));空指针异常
	}
}
