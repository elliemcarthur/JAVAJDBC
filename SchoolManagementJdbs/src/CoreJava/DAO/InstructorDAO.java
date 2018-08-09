package CoreJava.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Instructor;
import CoreJava.systemsInterfaces.InstructorDAOI;
import db.properties.OracleConnector;

public class InstructorDAO implements InstructorDAOI {

	@Override
	public List<Instructor> getAllInstructors() {
		ArrayList<Instructor> instructors=new ArrayList<Instructor>();
		Connection conn=null;
		PreparedStatement ps;
		String sql="select * from instructor";
		
		try {
			conn=OracleConnector.getConn();
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Instructor instructor=new Instructor();
				
				//checkcolumn name
				instructor.setInstructor_id(rs.getInt("instructorid"));
				instructor.setFull_name(rs.getString("full_name"));
				instructor.setEmail(rs.getString("email"));
				instructor.setSpeciality(rs.getString("speciality"));
				instructor.setAdmin_role(rs.getInt("admin_role"));
				instructor.setPass(rs.getString("password"));
				instructors.add(instructor);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(!conn.equals(null)) {
				try{
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		return null;
	}

	@Override
	public Instructor getInstructorsByGmail(String email) {
		Instructor instructor=new Instructor();
		Connection conn=null;
		PreparedStatement ps;
		String sql="select * from instructor where email=?";
		
		try {
			conn=OracleConnector.getConn();
			ps=conn.prepareStatement(sql);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
