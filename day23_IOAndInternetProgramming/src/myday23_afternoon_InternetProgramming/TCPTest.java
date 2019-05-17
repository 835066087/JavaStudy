package myday23_afternoon_InternetProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

/*
 * 客户端发送内容给服务端，服务端将内容打印到控制台上。


 */
public class TCPTest {

	@Test
	public void client() throws IOException {
		//1.创建一个用于通信的Socket，指明服务器端的ip和端口号
		InetAddress address = InetAddress.getByName("127.0.0.1");
		Socket socket = new Socket(address,9090);
		//2.得到一个用于输出的流
		OutputStream ops = socket.getOutputStream();
		//3.写出数据
		ops.write("你好我是客户端".getBytes());
		//4.关闭资源
		ops.close();
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
		byte[] buffer = new byte[1024];
		int len;
		while((len = ips.read(buffer))!= -1) {
			String str = new String(buffer,0,len);
			System.out.println(str);
		}
		
		ips.close();
		serverSocket.close();
	}
}
