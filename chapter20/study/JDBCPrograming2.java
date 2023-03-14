package chapter20.study;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//try~catch

public class JDBCPrograming2 extends JFrame {
	private JFrame jFrame;
	private JButton startBtn;
	private JLabel startScreen;
	private JTextArea textArea = new JTextArea();
	private GameHandler handler;
	int x = 0;
	int y = 0;

	public JDBCPrograming2() {

		initJFrame();
	}

	class GameThread implements Runnable {
		public void run() {
			while (!handler.isGameOver()) {
				handler.drawAll();
			}
			handler.drawGameOver();
		}
	}

	private void initJFrame() {
		setTitle("Let's play BlackJack");
		setSize(1000, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		textArea.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		add(textArea);
		textArea.setEditable(false);
		setVisible(true);
//		jFrame.getContentPane().setBackground(Color.WHITE);
		handler = new GameHandler(textArea);
		new Thread(new GameThread()).start();
		aaa();
	}

	public void aaa() {

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			connection = DriverManager.getConnection(url, "SHIN", "java");
			statement = connection.createStatement();

			// 문자열 겹합보다는 StringBilnder나 StringBuffer를 사용하는게 좋다.
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT");
			builder.append("    mem_id,");
			builder.append("    mem_name,");
			builder.append("    mem_bir,");
			builder.append("    mem_add1,");
			builder.append("    mem_add2,");
			builder.append("    mem_job");
			builder.append(" FROM");
			builder.append("    member");

			String sql = builder.toString();
			resultSet = statement.executeQuery(sql);
			System.out.println("아이디\t이름\t생년월일\t주소\t직업");

			while (resultSet.next()) {
				String memId = resultSet.getString("MEM_ID");
				String memName = resultSet.getString("MEM_NAME");
				Date memBir = resultSet.getDate("MEM_BIR");
				String memAdd1 = resultSet.getString("MEM_ADD1");
				String memAdd2 = resultSet.getString("MEM_ADD2");
				String memJob = resultSet.getString("MEM_JOB");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", memId, memName, memBir.toLocalDate().toString(), memAdd1,
						memAdd2, memJob);
				handler.drawToBuffer(1, 0, "아이디\t이름\t생년월일\t주소");
				handler.drawToBuffer(1, y++, memId + "\t" + memName + "\t" + memBir + "\t" + memAdd1 + "-" + memAdd2);
				handler.drawToBuffer(1, 24, "자바 제이 프래임 적용");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JDBCPrograming2();

	}
}
