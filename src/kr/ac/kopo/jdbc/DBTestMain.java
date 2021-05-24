package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//jdbc 드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// DB 접속 및 연결 객체 얻기
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.119.119:1521:dink",
					"scott","tiger89");
			
			System.out.println("DB 접속 성공 : " + conn);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
