package test;
import java.sql.*;

public class Helo {
public static void main(String[] args) throws Exception{
	
	
	String query="SELECT * FROM satish1.employe";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satish1","root","Satish@1");
	
	Statement st=con.createStatement();
		
	ResultSet Rest=st.executeQuery(query);
	
	while(Rest.next()) {
		String s=Rest.getString(1)+" "+Rest.getString(2)+" "+Rest.getString(3)+" "+Rest.getString(4);
		
		System.out.println(s);
	};
	
	
	st.close();
	con.close();
	}
}
