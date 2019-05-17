package day28_JDBC_Utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import day28_JDBC.ConnectionTest;

/*
 * 要想获取链接成功，需要具备：
 * 1.mysql的服务器端需要服务打开
 * 2.4个基本信息需要正确书写
 * 3.jar包是否正确加载
 * 4.配置文件jdbc.properties是否存放在src下
 * 
 * 
 */

public class JDBCUtils {

	public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {

		// 1.加载配置文件
		InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		pros.load(is);

		// 2.读取配置信息
		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");

		// 3.加载驱动
		Class.forName(driverClass);

		// 4.获取连接
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);

		return (conn);

	}

	public static void closeConnection(Connection conn, PreparedStatement ps) {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		if (ps != null)
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public static void closeResource(Connection conn, Statement statement, ResultSet rs) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
