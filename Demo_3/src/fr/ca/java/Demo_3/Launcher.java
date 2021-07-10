package fr.ca.java.Demo_3;

public class Launcher {

	public static void main(String[] args) {
		
		
		
		//what is an array ?
		//image something like
		//[ 42 ] [ 12 ] [ 35 ] 
		//   0      1      2
		int[] myArray = {42, 12, 35, 67, 45, 1, 58};
		System.out.println(myArray[1]);
		
		myArray[1] = 90;
		//[ 42 ] [ 12 ] [ 35 ] 
		//   0      1      2
		System.out.println("Print all my array");
//		System.out.println(myArray[0]);		
//		System.out.println(myArray[1]);
//		System.out.println(myArray[2]);
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		double [] myArray2 = {1};
		System.out.println(myArray2[0]);
		myArray2[0] = 12.5;
		System.out.println(myArray2[0]);
	}

}
