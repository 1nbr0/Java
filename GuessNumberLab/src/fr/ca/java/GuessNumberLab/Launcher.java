package fr.ca.java.GuessNumberLab;

import java.util.Random; 
import java.util.Scanner;


public class Launcher {
	public static void main(String[] args) {
		
		int guess;
		
        Scanner myNbr = new Scanner(System.in);
  
        Random rand = new Random(); //instance of random class
        int upperbound = 101;
          //generate random values from 0-100
        int int_random = rand.nextInt(upperbound); 
        
        boolean correct = false;
        
        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : "+ int_random);
        
        while (!correct) {
			System.out.print("Your number : ");	
			guess = myNbr.nextInt();
			
			if (guess < int_random) { 
                System.out.println("Higher"); 
            } 
  

            else if (guess > int_random) { 
                System.out.println("Lower"); 
            } 
  

            else { 
  
                System.out.println("This is it, You won !"); 
  
                correct = true;
            }
        }
        System.exit(0);
	}
}
