package jdbc_homework;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import jdbctility.JDBCUtils;

public class ExamStudentTestForQuery {

	public static void main(String[] args) throws Exception {
		String sql = "select FlowID,Type,IDCard,ExamCard,StudentName,Location,Grade from examstudent where ExamCard = ?";
		studentForQuery(sql,200523164754001l);
	}

	public static Student studentForQuery(String sql, Object... args) throws Exception {
		Connection conn = JDBCUtils.getConnection();
		PreparedStatement ps = conn.prepareCall(sql);
		for (int i = 0; i < args.length; i++) {
			ps.setObject(i + 1, args[i]);
		}
		ResultSet rs = ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		if (rs.next()) {
			Student student = new Student();
			for (int i = 0; i < columnCount; i++) {
				Object value = rs.getObject(i + 1);
				String columnName = rsmd.getCatalogName(i + 1);
				Field filed = Student.class.getDeclaredField(columnName);
				filed.setAccessible(true);
				filed.set(student, value);
			}
			return student;
		}

		JDBCUtils.closeResource(conn, ps, rs);

		return null;

	}

}
