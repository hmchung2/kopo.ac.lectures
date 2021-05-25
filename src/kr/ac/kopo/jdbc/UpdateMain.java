package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class UpdateMain {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.nextLine();
		StringBuilder sql = new StringBuilder();
		sql.append("update t_test");
		sql.append(" set name = ?");
		sql.append(" where id = ? ");
		try (
				// 팩토리를 사용하면 try 안에 try 문을 사용하지 않고 AutoClosable 객체만 생성
				Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setString(1, name);
			pstmt.setString(2, id);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
