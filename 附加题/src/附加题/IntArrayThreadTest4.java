package 附加题;

import java.util.ArrayList;

/*
 * 需求：入参为一个整型数组（Integer[] input），要求对入参(input)按奇偶数分成两个数组，
 * 要求启动两个线程，分别将入参(input)中的奇数和偶数输出到一个文件中，
 * 需要偶数线程每打印10个偶数以后，就将奇数线程打印10个奇数，如此交替进行。
 * 同时需要记录输出进度，每完成1000个数就在控制台中打印当前完成数量，
 * 并在所有线程结束后，在控制台打印“Done”
 * 
 * 
 */

public class IntArrayThreadTest4 {

	public static void main(String[] args) {

	}

	public Integer[] getOddNumber(Integer[] input) {

		Integer[] oddNumber = new Integer[input.length];
		int oddCount = 0;

		// 将奇数和偶数划归不同的数组
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 != 0) {
				oddNumber[oddCount] = input[i];
				oddCount++;
			}
		}

		// 构建完美数组
		Integer[] pon = new Integer[oddCount];

		for (int i = 0; i < pon.length; i++) {
			pon[i] = oddNumber[i];
		}
		return pon;

	}

	public Integer[] getEvenNumber(Integer[] input) {

		Integer[] evenNumber = new Integer[input.length];
		int evenCount = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				evenNumber[evenCount] = input[i];
				evenCount++;
			}
		}

		Integer[] pen = new Integer[evenCount];
		for (int i = 0; i < pen.length; i++) {
			pen[i] = evenNumber[i];
		}
		return pen;
	}

	class oddNumber implements Runnable {
		

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	}

}
