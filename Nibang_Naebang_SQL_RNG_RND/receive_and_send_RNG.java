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
		for (i = 0; i <= 50; i++) 
		{

			int k = (int) (Math.random() * 8999 + 1000);
			
			String ks = "";
			int englen =(int) (Math.random() * 7 + 1);
			int numlen =(int) (Math.random() * 8 + 2 );
			
			String Eng;
			String Num;
			
			for( int j = 0; j<englen; j++ )
			{
				char engran = (char)(Math.random()*26+97);
				if(ks == null)
					ks += engran;
				else
					ks += engran;
			}
			for( int j = 0; j<numlen-englen; j++ )
			{
				char numran = (char)(Math.random()*10+48);
				ks += numran;
			}
			// receiver 가 test
			if (k % 2 == 0) 
			{
				String sql = "insert into Test.msgtable values(?,?,?,?,?)";
				PreparedStatement pstmt = con.prepareStatement(sql);

				pstmt.setString(1, "test");
				pstmt.setString(2, ks);

				Date now = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yy.MM.dd HH:mm");
				String formatedNow = formatter.format(now);
				pstmt.setString(3, formatedNow);
				String context = null;
				

				
				
				
				
				if( k % 10 == 2)
				{
					context = "안녕하세요. 저는 " + ks + "에요";
				}
				else if( k % 10 == 4)
				{
					context = "반갑습니다. 저는 " + ks + "입니다";
				}
				else if( k % 10 == 6)
				{
					context = "제 아이디는 " + ks + "에요. 잘부탁드립니다.";
				}
				else if( k % 10 == 8)
				{
					context = "안녕하세요. 매칭 결과보고 연락드렸습니다. 제 아이디는 " + ks + "입니다.";
				}
				else if( k % 10 == 0)
				{
					context = "혹시 룸메이트 구하셨나요? " + ks + "로 답장 부탁드려요.";
				}
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

				pstmt.setString(1, ks);
				pstmt.setString(2, "test");

				Date now = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yy.MM.dd HH:mm");
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
