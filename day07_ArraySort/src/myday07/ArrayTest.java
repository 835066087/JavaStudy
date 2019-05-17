package myday07;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 20);
			
		}
		for(int n : arr) {
			System.out.print(n + " ");
		}
			System.out.println();
		
			
			//取子数组算法(如取所有的奇数成为一个子数组）
			//创建足够大的数组
			//依赖计数器count来作为脚标
		int[] newArr = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] / 2 !=0) {
				newArr[count] = arr[i];
				count++;
			}
		}
		
		int[] newArr1 = new int[count];
		
		for (int i = 0; i < newArr1.length; i++) {
			newArr1[i] =  newArr[i];
		}
		
		 
		for(int n : newArr1) {
			System.out.print(n + " ");
		}
			System.out.println();
				
		}
	
/*	public static void main1(String[] args) {
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 20);
		}
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//反转,有误，待更正
		for(int i = 0; i < arr.length / 2;i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			System.out.println(arr[i]);
		}
		
		//容量减半
		//1.创建新数组，容量是一半
		int[] newArr = new int[arr.length/2];
		//2.依次把老数组中的需要的数据复制到新数组中
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = arr[i];
		}
		//3.老引用指向新数组
		arr =  newArr;
		
	
		//扩容
		int[] newArr1 = new int[(int)(arr.length * 1.5)];
		for(int i = 0; i < arr.length; i++ ) {
			newArr1[i] = arr[i];
		}

		arr =  newArr1;
		
		
		//取子数组算法(如取所有的奇数成为一个子数组）
		//依赖计数器count来作为脚标
		
		
		
		
		
		
	}
	

		
		//找最大值，找最大值的下标
		/*int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[maxIndex]) { //如果i位置处的值大于maxIndex位置的值
				maxIndex = i;
			}
		}
		System.out.println("max:"+ arr[maxIndex]);
		
		int minIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("min:" + arr[minIndex]);
	}*/
		/*int maxIndex = -1;*/
		
	
	public static void main1(String[] args) {
		//随机产生一个20~50之间的整数		
		//int rand2 = (int)(Math.random() * 30 + 20);
		//System.out.println(rand2);

		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 20);
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
		//找最大值
		int max = arr[0];//假设第一个数最大
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("最大值为" + max);
		
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("最小值为" + min);
	
		
		//找最小值初值给最大:0x7FFFFFFF
		//找最大值处置给最小:0x80000000
		
		int min1 = 0x7FFFFFFF;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] % 3 == 0 && arr[i] < min1) {				
					min1 = arr[i];	
			}
		}
		if(min1 == 0x7FFFFFFF) {
			System.out.println("没有能被3整除的数");
		}else {
			System.out.println("min1:" + min1);
		}
		
		/*	int sum = 0;
		int count = 0;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] % 3 ==0) {
				sum += arr[i];
				count++;
			}
		}*/
	}
}
