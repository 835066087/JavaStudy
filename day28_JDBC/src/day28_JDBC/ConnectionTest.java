package day28_JDBC;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Test;

import com.mysql.jdbc.Driver;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {

		Driver driver = new com.mysql.jdbc.Driver();

		String url = "jdbc:mysql://localhost:3306/test";
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "9651896518");
		
		Connection conn = driver.connect(url, info);
	
		System.out.println(conn);

	}
	
	
	
	@Test
    public  void testConnection5() throws Exception {
    	//1.加载配置文件
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);
        
        //2.读取配置信息
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        //3.加载驱动
        Class.forName(driverClass);

        //4.获取连接
        Connection conn = DriverManager.getConnection(url,user,password);
        System.out.println(conn);

    }

}
