package myday10_Homework;

public class YangHuiTriangle {
	// 杨辉三角
	/*
	 * 1 
	 * 1 1
	 * 1 2 1 
	 * 1 3 3 1 
	 * 1 4 6 4 1 
	 */
	public static void main(String[] args) {

		int[][] doubleArray = new int[10][];

		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = new int[i + 1];// 创建二维数组，每一行比上一行多1，且第一行为1
			doubleArray[i][0] = doubleArray[i][i] = 1;// 给最边栏赋值
			if (i > 1) {// i > 1即从第三行开始
				for (int j = 1; j < doubleArray[i].length - 1; j++) {// 防止溢出，因此length要-1
					doubleArray[i][j] = doubleArray[i - 1][j - 1] + doubleArray[i - 1][j];// 给中间的数赋值
				}
			}
		}

		for (int i = 0; i < doubleArray.length; i++) {
			for (int j = 0; j < doubleArray[i].length; j++) {
				System.out.print(doubleArray[i][j] + "\t");// 遍历打印
			}
			System.out.println();
		}
	}
}
