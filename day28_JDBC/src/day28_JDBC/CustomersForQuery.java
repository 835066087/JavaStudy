package day28_JDBC;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.junit.Test;

import day28_JDBC_Utility.JDBCUtils;
import day28_JDBC_javabean.Customer;

/*
 * 针对于数据表customers表的查询操作
 * 
 * 
 */

public class CustomersForQuery {

	@Test
	public void testCustomerForQuery() throws Exception {
		
		String sql = "select name,id,email from customers where name = ?";
		Customer customer = customerForQuery(sql,"王一");
		System.out.println(customer);
	}
	
	
	
	@Test
	public Customer customerForQuery(String sql, Object... args) throws Exception {
		//获取链接
		Connection conn = JDBCUtils.getConnection();
		//预编译
		PreparedStatement ps = conn.prepareStatement(sql);
		//填充占位符
		for (int i = 0; i < args.length; i++) {
			ps.setObject(i + 1, args[i]);
		}
		
		//得到结果集
		ResultSet rs = ps.executeQuery();
		//获取结果集的元数据
		ResultSetMetaData rsmd = rs.getMetaData();
		//通过结果集的元数据获取结果集的列数
		int columnCount = rsmd.getColumnCount();
		if (rs.next()) {
			
			// 操作一，通过空参的构造器创建Customer类对象
			Customer cust = new Customer();
			// 操作二，将结果集中查到的各个字段的数据，设置到相应的属性上
			for (int i = 0; i < columnCount; i++) {
				Object value = rs.getObject(i + 1);

				//获取列名，列明即属性名
				String columnName = rsmd.getColumnClassName(i + 1);
				//通过反射赋值
				Field field = Customer.class.getDeclaredField(columnName);
				field.setAccessible(true);
				field.set(cust, value);

			}

			return cust;
		}
		JDBCUtils.closeResource(conn, ps, rs);

		return null;

	}

	public void testQuery1() throws ClassNotFoundException, IOException, SQLException {

		Connection conn = JDBCUtils.getConnection();

		String sql = "select id,name,email,birth from customers where id = ?";
		PreparedStatement ps = conn.prepareCall(sql);

		ps.setObject(1, 8);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			Date birth = rs.getDate(4);

		}

	}

}
