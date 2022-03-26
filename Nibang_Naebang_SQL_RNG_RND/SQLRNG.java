package nibangnaebang_RNG;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLRNG {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sqlrng();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static int sqlrng() throws SQLException {
		
		Connection con = null;
		final String URL = "jdbc:mysql://database-1.clbujp5dtees.ap-northeast-2.rds.amazonaws.com/";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "admin", "singapore");

		} catch (ClassNotFoundException e) {
			System.out.println("fail");
		}
		
		int i;
		String sql = "insert into Test.user values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		for (i = 1000; i <= 9999; i++) {

			pstmt.setInt(1, i);
			pstmt.setInt(2, i);
			pstmt.setInt(3, i);
			pstmt.setInt(4, (int) (Math.random() * 2 + 1));
			pstmt.setInt(5, (int) (Math.random() * 5 + 1));
			pstmt.setInt(6, (int) (Math.random() * 8 + 14));
			pstmt.setInt(7, (int) (Math.random() * 8 + 1996));
			pstmt.setInt(8, (int) (Math.random() * 12 + 1));
			pstmt.setInt(9, (int) (Math.random() * 6 + 1));
			pstmt.setInt(10, (int) (Math.random() * 6 + 1));
			pstmt.setInt(11, (int) (Math.random() * 6 + 1));
			pstmt.setInt(12, (int) (Math.random() * 3 + 1));
			pstmt.setInt(13, (int) (Math.random() * 3 + 1));
			pstmt.setInt(14, (int) (Math.random() * 2 ));
			pstmt.setInt(15, (int) (Math.random() * 2 ));
			pstmt.setInt(16, (int) (Math.random() * 2 ));
			pstmt.setInt(17, (int) (Math.random() * 4 + 1));
			pstmt.setInt(18, (int) (Math.random() * 3 + 1));
			pstmt.setInt(19, (int) (Math.random() * 3 + 1));
			pstmt.setInt(20, (int) (Math.random() * 3 + 1));
			pstmt.setInt(21, (int) (Math.random() * 3 + 1));
			pstmt.setInt(22, (int) (Math.random() * 3 + 1));
			pstmt.setInt(23, (int) (Math.random() * 2 + 1));
			pstmt.setInt(24, (int) (Math.random() * 4 + 1));
			pstmt.setInt(25, (int) (Math.random() * 2 + 1));
			pstmt.setInt(26, (int) (Math.random() * 2 + 1));
			pstmt.setInt(27, (int) (Math.random() * 3 + 1));
			pstmt.setInt(28, (int) (Math.random() * 2 + 1));
			pstmt.setInt(29, (int) (Math.random() * 2 + 1));
			pstmt.setInt(30, (int) (Math.random() * 3 + 1));
			pstmt.setInt(31, (int) (Math.random() * 3 + 1));
			pstmt.setInt(32, (int) (Math.random() * 3 + 1));
			pstmt.setInt(33, (int) (Math.random() * 3 + 1));
			pstmt.setInt(34, (int) (Math.random() * 5 + 1));
			
			System.out.println(i);

			pstmt.executeUpdate();
			
		}
		return 0;
	}
}
