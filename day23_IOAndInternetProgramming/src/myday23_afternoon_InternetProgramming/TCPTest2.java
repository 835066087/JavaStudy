package myday23_afternoon_InternetProgramming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Test;

/*
 * 2.客户端发送文件给服务端，服务端将文件保存在本地。
 */

public class TCPTest2 {
	
	@Test
	public void client() throws IOException {
		//1.创建一个用于通信的Socket，指明服务器端的ip和端口号
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address,9090);
		//2.得到一个用于输出的流
		OutputStream ops = socket.getOutputStream();
		//3.写出数据
		FileInputStream fis = new FileInputStream("1.jpg");
		byte[] buffer = new byte[1024];
		int len;
		while((len = fis.read(buffer))!= -1) {
			ops.write(buffer,0,len);
		}
		//4.关闭资源
		ops.close();
		fis.close();
		socket.close();
	}
	
	@Test
	public void Servier() throws IOException {
		//1.创建一个serverSocket
		ServerSocket serverSocket = new ServerSocket(9090);
		//2.接受来自于客户端的Socket
		Socket socket = serverSocket.accept();
		
		//3.获取客户端的数据
		InputStream ips = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream(new File("123.jpg"));
		
		byte[] buffer = new byte[1024];
		int len;
		while((len = ips.read(buffer))!= -1) {
			fos.write(buffer,0,len);
		}
		ips.close();
		fos.close();
		socket.close();
		serverSocket.close();
	}
	
}
