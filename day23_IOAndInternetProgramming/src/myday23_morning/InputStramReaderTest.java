package myday23_morning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

/*
 * 
 * 转换流的使用
 * 1.转换流如下，是两个字符流
 * InputStreamReader：字节的输入流转换为字符的输入流
 * OutputStreamWriter：将字符的输出流转换为字节的输出流
 * 
 * 2.实现字符流与字节流的转换
 * InputStreamReader：字节的输入流转换为字符的输入流
 * OutputStreamWriter：将字符的输出流转换为字节的输出流
 * 
 * 3.
 * 字节、字节数组 → 字符、字符串：解码
 * 字符、字符串 → 字节、字符数组：编码 
 * 
 * 4.常见的编码表
 * 
 * 
 * 
 */
public class InputStramReaderTest {

	/*
	 * 文本文件写出保存时，与读取时必须使用相同的字符集
	 * 
	 * 
	 */

	@Test
	public void Test1() throws IOException {
		FileInputStream fis = new FileInputStream(new File("gbk.txt"));
//		InputStreamReader isr = new InputStreamReader(fis);
//		InputStreamReader isr = new InputStreamReader(fis,"gbk");//显式规定字符集
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");

		char[] cbuf = new char[1024];
		int len;
		while ((len = isr.read(cbuf)) != -1) {
			String str = new String(cbuf, 0, len);
			System.out.print(str);
		}
		isr.close();
	}

	@Test
	public void Test2() throws IOException {
		FileInputStream fis = new FileInputStream(new File("gbk.txt"));
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");// 显式规定字符集，保存什么，就得用什么读

		FileOutputStream fos = new FileOutputStream("utf8");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");

		char[] cbuf = new char[1024];
		int len;
		while ((len = isr.read(cbuf)) != -1) {
			osw.write(cbuf, 0, len);
//			String str = new String(cbuf,0,len);
//			System.out.println(str);
		}
		osw.close();
		isr.close();
	}

	@Test
	public void Test3() throws IOException {
		FileInputStream fis = new FileInputStream(new File("utf8"));
		InputStreamReader isr = new InputStreamReader(fis, "gbk");// 显式规定字符集，保存什么,用什么读

		char[] cbuf = new char[1024];
		int len;
		while ((len = isr.read(cbuf)) != -1) {
			String str = new String(cbuf, 0, len);
			System.out.println(str);
		}
	}
}
