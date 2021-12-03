package MSGRNG;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class receive_and_send_RNG {

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
		//생성 수 조정
		for (i = 0; i <= 1000; i++) 
		{

			int k = (int) (Math.random() * 9999 + 1000);
			// receiver 가 test
			if (k % 2 == 0) 
			{
				String sql = "insert into Test.msgtable values(?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);

				pstmt.setString(1, "test");
				pstmt.setInt(2, k);

				Date now = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
				String formatedNow = formatter.format(now);
				pstmt.setString(3, formatedNow);

				String context = "안녕하세요. 저는 " + k + "입니다";
				pstmt.setString(4, context);
				pstmt.setInt(5, -1);

				System.out.println(k);

				pstmt.executeUpdate();
			} 
			
			else 
			{
				String sql = "insert into Test.msgtable values(?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);

				// sender가 test

				pstmt.setInt(1, k);
				pstmt.setString(2, "test");

				Date now = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
				String formatedNow = formatter.format(now);
				pstmt.setString(3, formatedNow);

				String context = "안녕하세요. 저는 test입니다";
				pstmt.setString(4, context);
				pstmt.setInt(5, -1);

				System.out.println(k);

				pstmt.executeUpdate();

			}
		}
		return 0;
	}
}
