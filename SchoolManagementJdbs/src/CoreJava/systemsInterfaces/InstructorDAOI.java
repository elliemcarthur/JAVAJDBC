package CoreJava.systemsInterfaces;

import java.util.List;

import CoreJava.Models.Instructor;

public interface InstructorDAOI {

	public List<Instructor> getAllInstructors();
	
	public Instructor getInstructorsByGmail(String email);
}
