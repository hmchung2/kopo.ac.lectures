package assignment0525;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("급여를 입력 하세요 : ");
		int sal = sc.nextInt();
		sc.nextLine();

		StringBuilder sql = new StringBuilder();
		sql.append("select JOB_TITLE , avg(salary) as SAL_AVG from (");
		sql.append(" select E.SALARY, J.JOB_TITLE FROM EMPLOYEES E, JOBS J ");
		sql.append(" WHERE E.JOB_ID = J.JOB_ID AND SALARY >= ?) group by JOB_TITLE");

		// 자동 close 사용
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setInt(1, sal);
			ResultSet rs = pstmt.executeQuery();
			int cnt = 0;
			while (rs.next()) {
				String jobTitle = rs.getString("JOB_TITLE");
				String avgSal = rs.getString("SAL_AVG");
				System.out.println("[ " + jobTitle + " ] " + avgSal);
				cnt++;
			}
			System.out.println("총 [" + cnt + "] 명이 검색되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
