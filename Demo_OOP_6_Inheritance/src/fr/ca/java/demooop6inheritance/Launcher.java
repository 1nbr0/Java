package fr.ca.java.demooop6inheritance;

public class Launcher {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Catlike catlike1 = new Catlike();
		catlike1.name = "Bob";
		catlike1.hunt();
		
		Cat cat1 = new Cat();
		cat1.name = "Fabrice";
		cat1.hunt();
		
		Tiger tiger1 = new Tiger();
		tiger1.name = "Roger";
		tiger1.hunt();
		
	}
}
