package CoreJava.Models;

public class Student {
private int student_id;
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getFull_name() {
	return full_name;
}
public void setFull_name(String full_name) {
	this.full_name = full_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public int getStudent_role() {
	return Student_role;
}
public void setStudent_role(int student_role) {
	Student_role = student_role;
}
private String full_name;
private String email;
private double gpa;
private String pass;
private int Student_role;
}
