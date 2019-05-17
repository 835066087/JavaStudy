package project2;

public class MainTest {
	
	public static void main(String[] args) {
		//虚拟机帮助我们完成这样的代码：args = new String[]{"aaa","bbb","ccc"}
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		//System.out.println(args[2]);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		//把命令行参数传入的多个整数字符串中，求平均值
		int[] arr = new int[args.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		
		int sum = 0;
		for(int n : arr) {
			sum += n;
		}
		
		int avg = sum/arr.length;
		System.out.println(avg);
				
	}

}
