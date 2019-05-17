package myday07;

public class AddToArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// 创建长度为10的数组
		int number = 10;
		int[] newArr = addToArray(arr, number);
		for (int i : newArr) {
			System.out.println(i);
		}

	}
	
	/**
	 * @param arr   	老数组
	 * @param number 	想要往老数组中插入的新数值
	 * @return arr1     扩容后的新数组
	 */
	
	public static int[] addToArray(int[] arr, int number) {
		int[] arr1 = new int[arr.length + 1];// 由于要添加的数据只有1个，因而只在原基础上增加1
		for (int i = 0; i < arr1.length; i++) {
			if (i == arr1.length - 1) {//当老数组被填充完毕，末尾放入添加的元素
				arr1[arr1.length - 1] = number;
			} else {
				arr1[i] = arr[i];
			}
		}
		return arr1;
	}
}
