package chapter20.study;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPrograming {
	public static void main(String[] args) throws Exception  {

		// JBDC (Java DataBace Connectivity)
		// DataBace vendor
		// 0. 준비물: DBMS 드라이버(oracle driver)
		// < 연결 방법 >
		// 1. 드라이버 로딩(Reflection 기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. 접속 정보를 이용하여 DB에 접속 (Coonection)
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SHIN", "java");

		// 3. 쿼리를 전송할 객체(Statement) 생성
		Statement statement = connection.createStatement(); // 워크시트 생성

		// 4. 쿼리를 실행 또는 전송
		String sql = "select mem_id , mem_name , mem_hp , mem_mail from member";

		// 5.select : excuteQuery => 쿼리 결과를 객체(ResultSet)로 전달 받음
		// insert , update , delete : executeUpdate => 실행 완료된 row 카운트 결과 전송
		ResultSet resultSet = statement.executeQuery(sql);

		System.out.println("아이디\t이름\t휴대전화번호\t  이메일");

		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");

			System.out.printf("%s\t%s\t%s\t%s\n", memId, memName, memHp, memMail);
			if(memId.equals("a001")) {
				System.out.println();
			}
		}
		// 6. 자원(Resource: Connection, Statement, ResultSet) 반납
		resultSet.close();
		statement.close();
		connection.close();
	}
}

//Connection connection = null;
//Statement statement = null;
//ResultSet resultSet = null;
//try {
//	Class.forName("oracle.jdbc.driver.OracleDriver");
//	String url = "jdbc:oracle:thin:@localhost:1521:xe";
//
//	connection = DriverManager.getConnection(url, "SHIN", "java");
//	statement = connection.createStatement();
//
//	// 문자열 겹합보다는 StringBilnder나 StringBuffer를 사용하는게 좋다.
//	StringBuilder builder = new StringBuilder();
//	builder.append("SELECT");
//	builder.append("    mem_id,");
//	builder.append("    mem_name,");
//	builder.append("    mem_bir,");
//	builder.append("    mem_add1,");
//	builder.append("    mem_add2,");
//	builder.append("    mem_job");
//	builder.append(" FROM");
//	builder.append("    member");
//
//	String sql = builder.toString();
//	resultSet = statement.executeQuery(sql);
//	System.out.println("아이디\t이름\t생년월일\t주소\t직업");
//
//	while (resultSet.next()) {
//		String memId = resultSet.getString("MEM_ID");
//		String memName = resultSet.getString("MEM_NAME");
//		Date memBir = resultSet.getDate("MEM_BIR");
//		String memAdd1 = resultSet.getString("MEM_ADD1");
//		String memAdd2 = resultSet.getString("MEM_ADD2");
//		String memJob = resultSet.getString("MEM_JOB");
//		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", memId, memName, memBir.toLocalDate().toString(), memAdd1,
//				memAdd2, memJob);
//		handler.drawToBuffer(1, 0,"아이디\t이름\t생년월일\t주소");
//		handler.drawToBuffer(1, y++, memId+"\t"+memName+"\t"+memBir+"\t"+memAdd1+"-"+memAdd2);
//		handler.drawToBuffer(1, 24, "자바 제이 프래임 적용");
//	}
//
//} catch (ClassNotFoundException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//} finally {
//	try {
//		if (resultSet != null) {
//			resultSet.close();
//		}
//		if (connection != null) {
//			connection.close();
//		}
//		if (statement != null) {
//			statement.close();
//		}
//	} catch (SQLException e) {
//		e.printStackTrace();
//	}
//}