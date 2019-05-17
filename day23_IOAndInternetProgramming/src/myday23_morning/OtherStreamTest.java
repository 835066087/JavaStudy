package myday23_morning;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.junit.Test;

/*
 * 1.标准的输入输出流
 * System.in
 * System.out
 * 
 * 2.通过System.setIn()或System.setOut()的方式设置新的输入、输出位置
 */

public class OtherStreamTest {

	@Test
	public void Test1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String data;
		while (true) {
			data = br.readLine();
			if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
				break;
			}
			System.out.println(data.toUpperCase());
		}
		br.close();
	}

	@Test
	public void Test2() {
		Scanner s = new Scanner(System.in);
		s.next();
	}

	@Test
	public void Test3() {
		int[] arr = new int[] { 1, 2, 3 };
		System.out.println(arr);

		char[] arr1 = new char[] { 'a', 'b', 'c' };// print只有char[]数组的输出，除此以外，都没有
		System.out.println(arr1);
	}

	/*
	 * 
	 * 数据流 DataInputStream 和 DataOutputStream
	 * 
	 * 作用：用于读取、写入基本数据类型，字符串，byte[]变量
	 */

	//先写再读，写了才能读
	@Test
	public void Test4() {
		DataOutputStream dos = null;
		try { // 创建连接到指定文件的数据输出流对象
			dos = new DataOutputStream(new FileOutputStream("destData.dat"));
			
			dos.writeUTF("我爱北京天安门"); // 写UTF字符串
			dos.writeBoolean(false); // 写入布尔值
			dos.writeLong(1234567890L); // 写入长整数
			System.out.println("写文件成功!");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 关闭流对象
			try {
				if (dos != null) {
					// 关闭过滤流时,会自动关闭它包装的底层节点流
					dos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void Test5() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("destData.dat"));
		   
			String info = dis.readUTF();
		    boolean flag = dis.readBoolean();
		    long time = dis.readLong();
		    
		    System.out.println(info);
		    System.out.println(flag);
		    System.out.println(time);
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    if (dis != null) {
		        try {
		            dis.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}
	}
	
	//对象流
	//ObjectInputStream和OjbectOutputSteam

	@Test
	public void Test6() {
		
	}

}
