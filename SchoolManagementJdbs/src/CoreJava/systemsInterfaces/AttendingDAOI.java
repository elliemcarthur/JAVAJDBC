package CoreJava.systemsInterfaces;

import java.util.List;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

public interface AttendingDAOI {

	public int registerStudentToCourse(Student student, Course course);
	
	public List<Student> getStudentCourse(int student_id);
	
}
