package myday22_homework;

import java.io.File;

/*
 * 遍历指定目录所有文件名称，包括子文件目录中的文件。
    拓展1：并计算指定目录占用空间的大小
    拓展2：删除指定文件目录及其下的所有文件

 */

public class FileTest3 {
	public static void main(String[] args) {

		File file1 = new File("/Users/liuyuanjie/Desktop/test");

		double sum = 0;
		// 用来最后统计整个文件的大小

		double sum1 = 0;
		// 用来计数文件夹中文件大小

		double sum2 = 0;
		// 用来计数子文件夹中文件大小

		// 遍历指定目录的所有文件名，包括子文件目录中的文件
		if (file1.isDirectory() == true) {

			File[] arr = file1.listFiles();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].isFile() == true) {
					System.out.println(arr[i].getName());
					sum1 += arr[i].length();
				} else {
					File[] arr1 = arr[i].listFiles();
					// 可用递归，写成方法
					for (int j = 0; j < arr1.length; j++) {
						System.out.println(arr1[j].getName());
						sum2 += arr[j].length();
					}
				}
			}
		}
		sum = sum1 + sum2;
		System.out.println(sum);
	}

	// 获取每个文件的文件名
	public static void printFileName(File file) {
		if (file.isFile()) {
			System.out.println(file.getName());
		} else {
			File[] files = file.listFiles();
			for (File f : files) {
				printFileName(f);// 递归调用
			}
		}
	}

	// 获取指定文件目录的大小
	public long getFileSize(File file) {
		long sum = 0;
		if (file.isFile()) {
			sum += file.length();
		} else {
			File[] files = file.listFiles();
			for (File f : files) {
				// 还是递归调用
				sum += getFileSize(f);
			}
		}
		return sum;
	}

	// 删除指定目录及其下所有的文件
	public static void delete(File parent) {
		if (parent.exists()) {
			if (parent.isDirectory() == true) {
				File[] arr = parent.listFiles();
				for (File file : arr) {
					delete(file);
				}
			}
			parent.delete();
		} else {
			System.out.println("输入文件不存在");
		}
	}
}
