package myday09;

import java.util.Arrays;

public class ArrayTest {
	
	public static void quick(int[] arr, int begin, int end) {
		if(begin >= end) {
			return;
		}
		//分区，找key值，确定ketIndex
		int key = arr[begin];
		int keyIndex = begin;
		for(int i = begin + 1; i < end; i++) {
			if(arr[i] < key) {
				keyIndex++;
				//交换keyIndex和i的位置
				int tmp = arr[i];
				arr[i] = arr[keyIndex];
				arr[keyIndex] = tmp;
			}
		}
		//交换开始位置和keyIndex位置，使得keyIndex位置处保存key值
		arr[begin] = arr[keyIndex];
		arr[keyIndex] = key;//分区完成，比key小的都在keyIndex左边，大的都在右边
		
		quick(arr,begin,keyIndex);//分区和递归
		quick(arr,keyIndex + 1, end);
		
	}

	public static void main(String[] args) {
		
		int[] arr = new int[8];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()* 20);
			
		}
		//遍历
		for(int n : arr) {
			System.out.print(n + " ");
		}
			System.out.println();
	
		//冒泡排序	
	/*1	for(int j = 0 ; j < arr.length - 1; j++) {	
			for(int i = 0; i < arr.length - 1 - j; i++)	{
				//依次比较i位置和i+1位置的值，如果左大右小，交换
				if(arr[i] > arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();*/

		/*2
		//选择排序
		for(int i = 0; i < arr.length - 1; i++) {
			//以i为基准位置，基准位置就是用于保存从此位置到后面中的所有数的最小值
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				//找最小值下标00000000
				 * 
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			//内循环结束
			//minIndex中保存的就是从基准位置到最厚重的所有数中的最小值的下标
			//此时，基准位置中就可以保存最小值，交换基准位置和最小值下标处的值
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		*/
		
		//快速排序
		//quick(arr,0,arr.length);
		Arrays.parallelSort(arr);//使用系统的排序
		
		
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		

		System.out.println("不知道");
		
	}
}
