package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn =null;
		Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		try {
			//jdbc 드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// DB 접속 및 연결 객체 얻기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.119.119:1521:dink",
					"scott","tiger89");
			
			System.out.println("DB 접속 성공 : " + conn);
			
			
			// SQL 실행 객체 얻기
			stmt = conn.createStatement();
			String sql = "insert into t_test(id , name)";
			
			System.out.print("아이디를 입려 : ");
			String id = sc.nextLine();
			
			System.out.print("이름을 입력 : ");
			String name = sc.nextLine();
			sql += " values(\'"+ id + "\',\'"+   name+"\')";
			//SQL문 실행 및 결과 얻기
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 "+ cnt + " 개 행 삽입");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
			sc.close();
		}
	}
}
