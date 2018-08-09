package db.properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnector {
	public static Connection getConn() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String user="System";
		String pass="Password1";
		
		Connection conn=DriverManager.getConnection(url, user, pass);
		return conn;
	}
}
