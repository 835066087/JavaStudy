package myday22_homework;

import java.io.File;
import java.io.IOException;

/*
 * 作业1：利用File构造器，new 一个文件目录file
     	1)在其中创建多个文件和目录
     	2)编写方法，实现删除file中指定文件的操作
 * 
 */

public class FileTest1 {

	public static void main(String[] args) throws IOException {

		// public File(String pathname):以pathname为路径创建File对象，可以是绝对路径或者相对路径
		File file1 = new File("/Users/liuyuanjie/eclipse-workspace/myday22/HelloWorld");
		file1.mkdir();// 若上层目录不存在，创建失败

		// public File(String parent,String child):以parent为父路径，child为子路径创建File对象。
		File file2 = new File("/Users/liuyuanjie/eclipse-workspace/myday22", "HelloWord1");
		if (!file2.exists()) {

			if (file2.createNewFile()) {
				System.out.println("文件创建成功");
			}
		} else {
			file2.delete();
			// 删除file中指定文件的操作，用到了SecurityManager类的对象方法，来确定其安全权限
			// 同时用到了checkDelete方法，依据path，删除文件
			// 但如果权限不够，getSecurityManager返回了isInvaid，则删除失败
			System.out.println("文件删除成功");
		}

		// public File(File parent,String child):根据一个父File对象和子文件路径创建File对象
		File file3 = new File("/Users/liuyuanjie/eclipse-workspace/myday22");
		File file4 = new File("file3", "HelloWorld2");
		file4.mkdirs();
		//若上层目录不存在，则创建上层目录
	}
}
