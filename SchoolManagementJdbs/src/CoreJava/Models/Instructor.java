package CoreJava.Models;

public class Instructor {
	
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getAdmin_role() {
		return admin_role;
	}
	public void setAdmin_role(int admin_role) {
		this.admin_role = admin_role;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	private int instructor_id;
	private String full_name;
	private String email;
	private String speciality;
	private int admin_role;
	private String pass;
	

}
