package MSGRND;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class senderRND {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sqlrnd();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static int sqlrnd() throws SQLException {
		
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		PreparedStatement pstmt = null;
		
		
		// sender가 test인거 삭제
		try {		
			int i;

			String sql = "DELETE FROM Test.msgtable where senderid = ?";
			pstmt = con.prepareStatement(sql);

			for (i = 1000; i <= 9999; i++) {		
				String to = "test"; 
				//인트면 Integer.toString(i);
				pstmt.setString(1, to);
				System.out.println(i);
				pstmt.executeUpdate();
			}	
		}		
		catch (Exception e) {System.out.println(e.getMessage());}
		finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				return 0;
			}
		}
		

		return 0;
	}

}
