package myday22_afternoon;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

/*
   1.获取功能
	public String getAbsolutePath()：获取绝对路径
	public File getAbsoluteFile()：获取绝对路径表示的文件
	public String getPath() ：获取路径
	public String getName() ：获取名称
	public String getParent()：获取上层文件目录路径。若无，返回null
	public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
	public long lastModified() ：获取最后一次的修改时间，毫秒值
	public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
	public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组 
   2.重命名功能
	public boolean renameTo(File dest):把文件重命名为指定的文件路径
   3.创建功能
    public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
	public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
	public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建

	
 */
public class FileTest {
	@Test
	public void test1() throws IOException {
		
		File file1 = new File("Hello.txt");
		if(!file1.exists()) {
			if(file1.createNewFile()) {
				System.out.println("文件创建成功");
			}
		}else {
			file1.delete();
			System.out.println("文件删除成功");
		}
	}
}
