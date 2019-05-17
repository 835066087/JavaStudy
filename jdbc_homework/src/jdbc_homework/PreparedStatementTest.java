package jdbc_homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

import jdbctility.JDBCUtils;

public class PreparedStatementTest {

	public static void main(String[] args) {
		String sql1 = "insert into customers(name,email,birth) values(?,?,?)";
		update(sql1, "EE", "classloader@126.com", "1992-09-08");
	}

	public static void update(String sql, Object... args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = JDBCUtils.getConnection();
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeConnection(conn, ps);
		}
	}
}
