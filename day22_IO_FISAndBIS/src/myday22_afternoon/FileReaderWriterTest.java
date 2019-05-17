package myday22_afternoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

import org.junit.Test;

/*
 * 
 * 抽象父类				节点流（文件流）			缓冲流（处理流的一种）
 * InputStream			FileInputStream			BufferedInputStream
 * OutputStream			FileOutputStream		BufferedOutputStream
 * Reader				FileReader				BufferedReader
 * Writer				FielWriter				BufferedWriter
 * 
 * 说明：
 * 1.对于输入流来讲，读入的文件一定要存在，否则报FileNotFoundException
 * 2.因为要保证流资源一定要关闭，所以需要使用try-catch-finally的方式处理异常
 * 		在finally中使用fw.close
 */

public class FileReaderWriterTest {

	@Test
	public void Test1() throws IOException {

		FileReader fr = null;

		try {
			// 1.提供File的实例，指明读入的文件的位置
			File file = new File("Hello.txt");
			// 2.创建输入流的实例
			fr = new FileReader(file);

			// 3.具体读取数据的细节
			char[] cbuf = new char[10];
			int len;// 记录每次读入到char[]中字符的个数
			while ((len = fr.read(cbuf)) != -1) {
				for (int i = 0; i < len; i++) {
					System.out.print(cbuf[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null)
					// 4.关闭资源
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// String str = new String(cbuf,0,len);
		// System.out.print(str);
	}

//			// 方式1:
//			int data = fr.read();
//			while (data != -1) {// 判断是否达到文件末尾，如果到达末尾，返回-1
//				System.out.print((char) data);
//				data = fr.read();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			// 4.关闭资源
//			try {
//				if (fr != null) {
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			} finally {
//				fr.close();// 一定要关闭
//
//			}
//
//		}
//	}

	/*
	 * 说明： 1.输出流对应的输出到的文件可以不存在 如果此文件不存在，则在执行的过程中，会自动创建此文件
	 * 如果此文件存在，1.使用单参数的构造器：会覆盖原有的文件 2.使用两参的构造器：比如FileWriter（file ,true)会在文件末尾追加
	 * 
	 * 
	 */

	@Test
	public void testFileWriter() throws IOException {

		// 1.提供File的实例，指明数据写出到的文件
		File file = new File("Hello.txt");

		// 2.提供输出流的实例
		FileWriter fw = new FileWriter(file);

		// 3.写出具体的过程
		try {
			fw.write("I love you, China!");
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			// 4.关闭资源
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void testFileReaderFileWriter() {
		// 1.提供File和输入、输出流的实例
		FileWriter fw = null;
		FileReader fr = null;
		try {
			File srcFile = new File("hello.txt");
			File destFile = new File("hello1.txt");
			fr = new FileReader(srcFile);
			fw = new FileWriter(destFile);

			// 2.读取数据、写出数据的操作
			char[] cbuf = new char[5];
			int len;
			while ((len = fr.read(cbuf)) != -1) {

				fw.write(cbuf,0,len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
