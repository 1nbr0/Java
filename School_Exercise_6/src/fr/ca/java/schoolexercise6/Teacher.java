package fr.ca.java.schoolexercise6;

public class Teacher extends Person{
	
	protected String Subject;
	protected double salary;
	
	public Teacher(String name, int age, String gender, String subject, double salary) {
		super(name, age, gender);
		this.Subject = subject;
		this.salary = salary;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Teacher : His Subject is " + Subject + ", his salary : " + salary + " $. " + super.toString();
	}
	
	
}
