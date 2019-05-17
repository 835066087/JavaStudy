package jdbc_homework;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbctility.JDBCUtils;

public class ExamStudentTest {
	public static void main(String[] args) {
	String sql1 = "insert into examstudent(FlowID,Type,IDCard,ExamCard,StudentName,Location,Grade) value(?,?,?,?,?,?,?)";
	update(sql1,7,6,123454195263214584l,200523164754006l,"孙权","建业",100);
		
		
	}
	
	
	//添加删除操作
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
