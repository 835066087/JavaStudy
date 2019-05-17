package myday14_morning;

public class Sorter {
	
	public static void sort(Student[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for(int j = i + 1; j < arr.length ; j++) {
				if(arr[j].compareTo(arr[minIndex]) < 0) {//比较后的选择排序
					minIndex = j;
				}
			}
			if(minIndex != i) {
				Student tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
}
