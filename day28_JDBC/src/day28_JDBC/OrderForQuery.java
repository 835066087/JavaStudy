package day28_JDBC;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.junit.Test;

import day28_JDBC_Utility.JDBCUtils;
import day28_JDBC_javabean.Order;

public class OrderForQuery {

	@Test
	public void testOrderForQuery() throws Exception {
		String sql = "select order_id orderId,order_name orderName,order_date orderDate from `order` where order_id = ?";
		Order order = orderForQuery(sql, 1);
		System.out.println(order);
	}

	@Test
	public Order orderForQuery(String sql, Object... args) throws Exception {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		for (int i = 0; i < args.length; i++) {
			ps.setObject(i + 1, args[i]);
		}

		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		if (rs.next()) {
			Order order = new Order();
			for (int i = 0; i < args.length; i++) {
				Object value = rs.getObject(i + 1);
				String columnLabel = rsmd.getColumnLabel(i + 1);
				Field field = Order.class.getDeclaredField(columnLabel);
				field.setAccessible(true);
				field.set(order, value);
			}
			return order;
		}

		JDBCUtils.closeResource(conn, ps, rs);
		return null;

	}
}
