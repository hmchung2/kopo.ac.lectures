package database.practice;

import java.sql.*;
import java.util.ArrayList;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String serverName = "192.168.119.119";
		String portNumber = "1521";
		String sid = "dink";
		String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
		String username = "scott";
		String password = "tiger89";
		
		System.out.println(url);
		Connection conn = DriverManager.getConnection(url, username, password);
	

		String sql = "SELECT * from emp";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
	
		ArrayList<String> list = new ArrayList<String>();

		while (rs.next()) {
			
			String current = rs.getString("ENAME");
			current = current + "\t" + rs.getString("SAL");
			current = current + "\t" + rs.getString("COMM");
			current = current + "\t" + rs.getString("DEPTNO");
			current = current + "\t" + rs.getString("JOB");
			list.add(current);
		}
		System.out.println("ENAME" + "\t" +  "SAL"+ "\t" + "COMM" + "\t" + "DEPTNO" + "\t" + "JOB"  );
		System.out.println("");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}


