
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test3 {
	
	 public static void main(String[] args) {
		
		 try {
		 //step1-load the driver class
		 
		 Class.forName("org.postgresql.Driver");
		 
		 System.out.println("driver class got loaded");
		 
		 //step2 - obtain the connection 
		 
		 Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","yogesh123");
		 
		 System.out.println("i got the connection");
		 
		 //step3-sending the queries
		 
		 Statement st = con.createStatement();
		 
		 //step4-process the query
		   String query = "insert into student values(101,'waiker')";
		 //String query = "update Student set stname='hasankhan' where stid=101";
		// String query = "delete from student where stid=103";
		   int x = st.executeUpdate(query);
		// System.out.println(x + "row(s) deleted");
		 
		 //step5-close the connection 
		 
		 con.close();
		 
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	}

}
