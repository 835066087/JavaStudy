package myday24_Internet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.Test;

public class URLTest {
	// 实现从网页上下载的操作
	public static void main(String[] args) throws IOException {

		URL url = new URL("http://localhost:8080/examples/hello.jpg");

		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		conn.connect();// 调用方法

		InputStream is = conn.getInputStream();
		FileOutputStream fos = new FileOutputStream("hello.jpg");
		byte[] buffer = new byte[1024];
		int len;
		while ((len = is.read(buffer)) != -1) {
			fos.write(buffer, 0, len);
		}

		fos.close();
		is.close();
		conn.disconnect();// 断开与服务器的链接

	}

	@Test
	public void Test1() {
		try {
			URL url = new URL("http://localhost:8080/examples/hello.jpg?name=Tom&pwd=abc123");
//			public String getProtocol(  )     获取该URL的协议名
			System.out.println(url.getProtocol());
			
//			public String getHost(  )           获取该URL的主机名
			System.out.println(url.getHost());
			
//			public String getPort(  )            获取该URL的端口号
			System.out.println(url.getPort());
			
//			public String getPath(  )           获取该URL的文件路径
			System.out.println(url.getPath());
			
//			public String getFile(  )             获取该URL的文件名
			System.out.println(url.getFile());
			
//			public String getQuery(   )        获取该URL的查询名
			System.out.println(url.getQuery());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
