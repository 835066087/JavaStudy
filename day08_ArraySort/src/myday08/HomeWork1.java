package myday08;
//需求：使用下标的方式, 找出数列中能被3整除的数的最小值

public class HomeWork1 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];//创建数列
		
		for(int i = 0; i < arr.length; i++) {//为数列中每个对象赋值
			arr[i] = (int)(Math.random()* 100);
			
		}
		for(int n : arr) {//遍历数列
			System.out.print(n + " ");
		}
			System.out.println();
			
		int minIndex = -1;	//不可设为0，因为如果为0，第一个数如不能被3整除，而又没有其他能被3整除的数，将会被代入最小值中
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]% 3 == 0) {//判断是否能被3整除
				if(minIndex == -1) {//判断是否仍是-1，防止超出范围
					minIndex = i;
				}else if(arr[i] < arr[minIndex] ) {//判断大小
						minIndex = i ;
				}
			}
		}
		if(minIndex == -1) {//判断最终有无能被3整除的数
			System.out.println("没有能被3整除的最小数");
		}else {
		System.out.println("能被3整除的最小数为:" + arr[minIndex]);
		}
	}
}
	

