package com.atguigu.team.service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItemService {

	public void readTextFile(String filename) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		InputStreamReader isr = null;

		try {
			fis = new FileInputStream(filename);
			bis = new BufferedInputStream(fis);
			isr = new InputStreamReader(bis, "utf-8");

			char[] buffer = new char[1024];
			while (isr.read(buffer) != -1) {
				String str = new String(buffer, 0, buffer.length);
				System.out.print(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (isr != null)
					isr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			try {
				if (bis != null)
					bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
