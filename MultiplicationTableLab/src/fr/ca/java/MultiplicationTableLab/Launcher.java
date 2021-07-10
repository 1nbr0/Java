package fr.ca.java.MultiplicationTableLab;

import java.util.Scanner;

public class Launcher {
	public static void main(String[] args) {
		
        Scanner size = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int nbr = size.nextInt();
        System.out.println("Your size : " + nbr);
        
        int n = nbr;
        table(n);
	} 
        public static void table(int n) {
        	System.out.print("*\t| ");
            for (int i = 1; i <= n; i++) {
            	System.out.print(i + "\t");
            }
            System.out.println();
            for (int j = 1; j <= n; j++) {
            	System.out.print("---");
            }
            System.out.println();
            for (int y = 1; y <= 10; y++) {
            	System.out.print(y+ "\t| ");
            	for (int x = 1; x <= n; x++) {
            		System.out.print(y * x + "\t");
            	}
            	System.out.println();
            }
        }

}
