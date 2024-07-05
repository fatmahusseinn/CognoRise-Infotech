package com.myfirst;
import java.util.Scanner;
import java.util.Random;


public class App {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomInt = random.nextInt(100) + 1;
		System.out.println(randomInt);
		
		Scanner input = new Scanner(System.in);
		
		int maxAttempts = 5;
		int attempts = 0;
		
		while (attempts < maxAttempts) {
			
	        System.out.print("Guess the number (between 1 and 100): ");
	        int number = input.nextInt();
	        attempts++;
	        
	        if (number == randomInt) {
	            System.out.println("Correct guessing! You guessed the number in " + attempts + " attempts");
	            break;
	            
	        } else if (number > randomInt) {
	        	
	            System.out.println("Your guess is too high");
	        } else {
	        	
	            System.out.println("Your guess is too low");
	        }
	        
	        
	        if (attempts < maxAttempts) {
	        	
	            System.out.println("You have " + (maxAttempts - attempts) + " attempts left");
	            
	        } else {
	            System.out.println("Sorry, you've used all your attempts. The correct number was " + randomInt);
	        }
        }
        input.close();

	}

}
