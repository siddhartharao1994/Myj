package Connect;

import java.sql.*;

public class connect {

	public static Connection fetchConnection() throws Exception {
		// TODO Auto-generated constructor stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","superdrypunk");
		
	}

}
