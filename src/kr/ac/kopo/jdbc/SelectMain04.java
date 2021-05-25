package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;

public class SelectMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select * from t_test";
		try (
				// 팩토리를 사용하면 try 안에 try 문을 사용하지 않고 AutoClosable 객체만 생성
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println("id : " + id + ", name : " + name);
			}
			System.out.println("done here");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
