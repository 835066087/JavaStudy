package jdbctility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {

	public static Connection getConnection() throws Exception {
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
		Properties pros = new Properties();
		pros.load(is);

		String user = pros.getProperty("user");
		String password = pros.getProperty("password");
		String url = pros.getProperty("url");
		String driverClass = pros.getProperty("driverClass");

		Class.forName(driverClass);

		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;
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
