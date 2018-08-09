package CoreJava.systemsInterfaces;

import java.util.List;

import CoreJava.Models.Course;

public interface TeachingDAOI {

	public int registerStudentToCourse(int course_id, int instructor_id);
	
	public List<Course> getInstructorsCourses();
}
