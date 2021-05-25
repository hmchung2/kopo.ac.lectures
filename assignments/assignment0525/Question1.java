package assignment0525;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import kr.ac.kopo.util.ConnectionFactory;

public class Question1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("급여를 입력 하세요 : ");
		int sal = sc.nextInt();
		sc.nextLine();

		StringBuilder sql = new StringBuilder();
		sql.append(
				"select salary , title from (select e.salary  , job_title as title from employees e, jobs j where e.job_id = j.job_id ) where salary > ?");

		Map<String, List<Integer>> map = new HashMap<>();

		// 자동 close 사용
		try (Connection conn = new ConnectionFactory().getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql.toString());) {
			pstmt.setInt(1, sal);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				String jobtitle = rs.getString("title");
				int salary = rs.getInt("salary");
				if (!map.containsKey(jobtitle)) {
					List<Integer> intList = new ArrayList<Integer>();
					intList.add(salary);
					map.put(jobtitle, intList);
				} else {
					List<Integer> intList = map.get(jobtitle);
					intList.add(salary);
					map.put(jobtitle, intList);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.print("Job title : " + key + "\t");
			List<Integer> intList = map.get(key);
			int sum = 0;
			int num = 0;

			if (!intList.isEmpty()) {
				for (Integer salary : intList) {
					sum = sum + salary;
					num = num + 1;
				}

			}
			System.out.println("평균 연봉 : " + (sum / num));
		}
	}
}
