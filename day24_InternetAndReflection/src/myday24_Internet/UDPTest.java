package myday24_Internet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.junit.jupiter.api.Test;

public class UDPTest {

	@Test
	public void sender() throws IOException {
		
		DatagramSocket datagramSocket = new DatagramSocket();//套接字，收发程序
		byte[] buf = "你好，我是发送端".getBytes();//数据
		InetAddress address = InetAddress.getByName("192.168.31.38");//地址
		DatagramPacket p = new DatagramPacket(buf,0,buf.length,address,9090);//数据包
		
		datagramSocket.send(p);//发送p
		datagramSocket.close();//关闭资源
	}
	
	@Test
	public void receiver() throws IOException {//接收端
		DatagramSocket datagramSocket = new DatagramSocket(9090);//接收端的端口
		byte[] buf = new byte[1024];//读取
		DatagramPacket p = new DatagramPacket(buf,buf.length);//读取范围
		datagramSocket.receive(p);
		
		String str = new String(buf,0,p.getLength());//通过String输出
		System.out.println(str);
		
		datagramSocket.close();//关闭流
	
	}
	
}
