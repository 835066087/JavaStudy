package test;
/*
 * 
 * 
 * 
 * 
 * 
 */
public class Test7 {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char findValue = 'g';
		int findIndex = -1;
		int leftIndex = 0;
		int midIndex = arr.length / 2;
		int rightIndex = arr.length - 1;

		while (true) {
			if (arr[midIndex] == findValue) {
				findIndex = midIndex;
				break;
			} else {
				if (midIndex == 0 || midIndex == arr.length - 1) {
					break;
				}
				if (findValue < arr[midIndex]) {
					rightIndex = midIndex;
					midIndex = leftIndex + (rightIndex - leftIndex) / 2;
					//midIndex -= 1;//我以为是个骚东西，结果是个弟弟东西
				} else {
					leftIndex = midIndex;
					midIndex = leftIndex + (rightIndex + 1 - leftIndex) / 2;
					//midIndex += 1;
				}
			}
		}
		if (findIndex == -1) {
			System.out.println("在数组中不存在");
		} else {
			System.out.println(findValue + "在数组中的位置是" + findIndex);
		}
	}
}
