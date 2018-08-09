package CoreJava.systemsInterfaces;

import java.util.List;

import CoreJava.Models.Course;

public interface CourseDAOI {

	public List<Course> getAllCourses();
	
	public List<Course> getCourseByInstructor(int instructor_id);
}
