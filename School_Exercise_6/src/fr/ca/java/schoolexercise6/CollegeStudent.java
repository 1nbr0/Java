package fr.ca.java.schoolexercise6;

public class CollegeStudent extends Student{
	
	protected String major;
	protected int year;
	
	public CollegeStudent(String name, int age, String gender, String studentId, double gradePointAverage, int year, String major) {
		super(name, age, gender, studentId, gradePointAverage);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "CollegeStudent : His major is " + major + ", " + year + " years old. " + super.toString();
	}
	
	
	
}
