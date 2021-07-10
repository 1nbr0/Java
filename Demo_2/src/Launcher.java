
public class Launcher {
	
	
	public static void main(String[] args) {
		System.out.println("Hello Demo_2");
		
		int myInt = 10;
		changeMyInt(myInt);
		System.out.println(myInt);//What is the value of myInt here ?
		
		int myInt2 = 2;
		addToMyInt(myInt2);
		System.out.println(myInt2);//What is the value of myInt here ?
		
		double myDouble1 = 10.0;
		double myDouble2 = 20.0;
		
		myDouble1 = myDouble2;
		myDouble2 = 30.0;
		
		System.out.println(myDouble1);//What is the value of myInt here ?
		System.out.println(myDouble2);//What is the value of myInt here ?
		
		double resultInch = Converter.cmToInch(30);
		double resultFah = Converter.celsiusToFahrenheit(32);	
		
		System.out.println(resultInch);
		System.out.println(resultFah);
	}
	
	public static void changeMyInt(int myInt) {
		myInt = 0;
	}
	
	public static int addToMyInt(int myVar) {
		return myVar + 10;
	}

}
