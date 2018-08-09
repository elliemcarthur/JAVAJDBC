package CoreJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.Models.Student;
import CoreJava.systemsInterfaces.StudentDAOI;
import db.properties.OracleConnector;

public class StudentDAO implements StudentDAOI {
	

	
	public boolean validateUser(String passToValidate, String comparablepass) {
		boolean passValidated=false;
		while(passToValidate==comparablepass) {
			passValidated=true;
		}
		
		return passValidated;
		
		
	}

	@Override
	public Student getStudentbyGmail(String email) {
		Student student=new Student();
		Connection conn=null;
		PreparedStatement ps;
		String sql="select * from student where email=?";
		
		try {
			conn=OracleConnector.getConn();
			ps=conn.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			while(rs.next());
			student.
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}

}
