package day28_JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import day28_JDBC_Utility.JDBCUtils;

/*

使用PreparedStatement实现通用的增删改查操作



*/

public class PreparedStatementTest {

	@Test
	public void testUpdate() {

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1.获取链接
			conn = JDBCUtils.getConnection();
			// 2.获取PreparedStatement
			// 提供一条带占位符的sql语句
			String sql = "update customers set email = ? where id = ?";
			ps = conn.prepareStatement(sql);
			// 3.填充占位符
			ps.setString(1, "tang@126.com");// 通过id号更改邮箱
			ps.setInt(2, 1);// id号
			// 4.执行sql语句
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5.资源的关闭
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (ps != null) {
					try {
						ps.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	@Test
	public void testCommonUpdate2() {
		String sql1 = "insert into user_table(user,password,balance) values(?,?,?)";
		update(sql1, "EE", "cc234", 1000);
	}

	@Test
	public void testCommonUpdate1() {
		String sql1 = "delete from customers where id = ?";
		update(sql1, 19);
	}

	@Test
	public void testCommonUpdate() {
		String sql1 = "update users set address = ? where id = ? ";
		update(sql1, "马来西亚", 4);
	}
	
	//批量增删改均可，示例如上
	public void update(String sql, Object... args) {
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 获取链接，以及获取preparedstatement（预编译sql语句）
			conn = JDBCUtils.getConnection();

			ps = conn.prepareStatement(sql);
			// 填充占位符
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i + 1, args[i]);
			}

			// 执行
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.closeConnection(conn, ps);
		}
	}

	
	//普通添加示例
	@Test
	public void testInsert() throws ParseException, SQLException, ClassNotFoundException, IOException {
		Connection conn = null;
		PreparedStatement ps = null;
		// 1.通过工具类获取链接
		conn = JDBCUtils.getConnection();

		// 2.获取PreparedStatement——在此之前提供一条带占位符的sql语句
		String sql = "insert into customers(name,email,birth)values(?,?,?)";
		ps = conn.prepareStatement(sql);

		// 3.填充占位符
		ps.setString(1, "类加载器");
		ps.setString(2, "classloader@126.com");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = sdf.parse("1992-09-08");
		ps.setDate(3, new Date(date.getTime()));

		// 4.执行sql语句
		ps.execute();

		// 5.资源关闭
		conn.close();
		ps.close();

	}

}
