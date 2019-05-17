package myday23_afternoon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/*
 * RandomAccessFile:随机存取文件流
 * 1.直接继承与Object 实现了DataInput和DataOutput接口
 * 2.可做输入流，也可作输出流
 * 
 * 
 * 
 */



public class RandomAccessFileTest {

	@Test
	public void Test1() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("1.jpg","r");
		RandomAccessFile raf1 = new RandomAccessFile("11.jpg","rw");
		
		byte[] buffer = new byte[1024];
		int len;
		while((len = raf.read(buffer)) != -1) {
			raf1.write(buffer,0,len);
		}
		raf.close();
		raf1.close();
	}
	/*
	 * 1.写出到的文件如果不存在，在写出过程中会自动创建输出到的文件
	 * 2.写出到的文件存在，则并不覆盖已有的文件，而对已有文件内容进行覆盖
	 * 		默认情况下从文件的开头覆盖
	 * 
	 * 
	 */
	
	@Test
	public void Test2() throws IOException {
		RandomAccessFile raf1 = new RandomAccessFile("hello","rw");
		
		raf1.seek(5);
		
		raf1.write("xyz".getBytes());
		
		raf1.close();
		
		//如何实现xyz在索引5位置开始的插入
		
	}
	
}
