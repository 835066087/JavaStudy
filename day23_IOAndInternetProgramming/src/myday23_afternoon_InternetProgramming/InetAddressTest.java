package myday23_afternoon_InternetProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 
 * 主要问题
 * 1.如何准确地定位网络上一台或多台主机；定位主机上的特定的应用——IP和端口号
   2.找到主机后如何可靠高效地进行数据传输——网络通信协议
	
   两个要素
   要素1：IP和端口号
   要素2：网络通信协议
   
   
   
   IP:对应网络上的一台主机
    	1. IP分类：分类一：IPV4和IPV6
    		   分类二：公网地址和私有地址（192.168开头的）
    		   
    	2. InetAddress:代表一个具体的IP
    		>如何实例化：getByNmae(String host);
    		
    		两个常用方法：getHostName();
    				   getHostAddress();
    		
    	3. 背景：IP地址不易记忆
    	域名：www.google.com
    	
    	4.本地回路地址127.0.0.1 ----localhost
    	
   端口号：区分主机上的不同的进程
   	要求：不同的进程有不同的端口号
   	范围：16位的整数 0-65535
   	
   	IP和端口号合并在一起，构成一个网络套接字：Socket
 * 
 */
public class InetAddressTest {
	public static void main(String[] args) {
		
		try {
			InetAddress inet = InetAddress.getByName("192.168.31.28");
			InetAddress inet1 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
