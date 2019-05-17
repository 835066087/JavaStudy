package myday23_afternoon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsTest {
	public static void main(String[] args) {

		try {
			File file1 = new File("1.jpg");
			File file2 = new File("12.jpg");
			FileUtils.copyFile(file1, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
