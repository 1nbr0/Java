
public class Launcher {

	//main
	public static void main(String[] args) {
		//sysout
		System.out.println("Hello Demo_1");
		
		sayHello();
		sayHello("William");
		
		double fahrenheit = cellsiusToFarenHeit(20.0);
		System.out.println("F is " + fahrenheit);
	}
	
	public static void sayHello() {		
		System.out.println("Hello you!");
		
	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static double cellsiusToFarenHeit(double celsius) {
		double result = (celsius * 1.8) + 32;
		return result;
	}
}
