package myday22_morning;

import java.io.File;
import java.util.Date;

import org.junit.Test;

public class FileTest {
/*
 *  File实例化
 *  1.构造器
 *  public File(String pathname):以pathname为路径创建File对象，可以是绝对路径或者相对路径
	
	public File(String parent,String child):以parent为父路径，child为子路径创建File对象。
	
	public File(File parent,String child):根据一个父File对象和子文件路径创建File对象
	
	2.路径
	（1）绝对路径：如：/Users/liuyuanjie/anaconda3/doc/global
	（2）相对路径：如：abc

 */
	
	@Test
	public void Test1() {
		File file1 = new File("hello.txt");
		
		System.out.println(file1.getAbsolutePath());//获取绝对路径
		System.out.println(file1.getAbsoluteFile());//获取绝对路径表示的文件
		System.out.println(file1.getPath());//获取路径
		System.out.println(file1.getName());//获取名称
		System.out.println(file1.getParent());//获取上层文件目录路径
		System.out.println(file1.length());//获取文件长度（即：字节数）。不能获取目录的长度
		System.out.println(new Date(file1.lastModified()));//获取最后一次的修改时间，毫秒值
		
	}
}
