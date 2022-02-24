import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test2 {
	public static void main(String[] args) throws Exception {
		Class.forName("org.postgresql.Driver");
		System.out.println("class got loaded");
		Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","yogesh123");
		System.out.println("connected");
		Statement st = con.createStatement();
		String query = "insert into test values (101,'yogesh')";
		
		con.close();
	}

}
