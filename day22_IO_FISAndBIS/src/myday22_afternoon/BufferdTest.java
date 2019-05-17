package myday22_afternoon;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdTest {
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			// 1.提供File和输入流、输出流的实例
			File file1 = new File("husky.jpg");
			File file2 = new File("husky1.jpg");

			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			// 2.具体的读取、写入数据的操作
			byte[] buffer = new byte[1024];
			int len;
			while ((len = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null)
					fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
