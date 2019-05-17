package myday22_homework;

import java.io.File;

/*
 *作业2 
 * 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 * 
 */

public class FileTest2 {

	public static void main(String[] args) {

		File file1 = new File("/Users/liuyuanjie/eclipse-workspace/myday22");

		// 先判断此文件是不是文件夹
		// 如果是，则遍历此文件目录，看内部名是否包含jpg,包含，则打印
		if (file1.isDirectory() == true) {

			File[] arr = file1.listFiles();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getName().contains(".jpg")) {
					System.out.println(arr[i].getName());
				}
			}
		} else {
			System.out.println("该文件并非文件目录");
		}
	}

}
