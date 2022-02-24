package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class tes1 {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","yogesh123");
			Statement st = con.createStatement();
			String query = "insert into test values(1,'yoges')";
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

