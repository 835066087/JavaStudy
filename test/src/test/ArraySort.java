package test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] arr = { 9, 6, 5, 4, 3, 23, 4543, 3214, 54, 975 };
		
		/*int[] bibleSort = bubleSort(arr);
		for (int i : bibleSort) {
			System.out.println(i);
		}*/
		
		/*int[] selectionSort = selectionSort(arr);
		for (int i : selectionSort) {
			System.out.println(i);
		}*/
		
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

	/**
	 * 冒泡排序，思路是从左到右一次比较，左右两个数不断交换位置，从而达到排序的目的
	 * @param arr
	 * @return arr
	 */
	public static int[] bubleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {//第一次交换后，最右侧一定为最大值，因而-1简化运算
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	/**
	 * 选择排序，思路是以minIndex为基准位置，保存从此位置到后面中的所有数的最小值
	 * 其中内循环负责寻找最小值，外循环负责替换最小值
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		return arr;
	}
	
	
}
