package fr.ca.java.mypointcorrection;

public class Launcher {
	
	public static void main(String[] args) {
		
		MyPointCorrection pc1 = new MyPointCorrection();
		System.out.println(pc1);
		pc1.setX(5);
		pc1.setY(8);
		System.out.println(pc1);
		
		MyPointCorrection[] pointsArray = new MyPointCorrection[10];
		for (int i = 0; i < pointsArray.length; i++) {
			System.out.println(pointsArray[i]);
			pointsArray[i] = new MyPointCorrection(i+1, i+1);
			System.out.println(pointsArray[i]);
		}
		
	}
}
