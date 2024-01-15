package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int theRandomNumber = random.nextInt(100) + 1;
		
		int numberOfGuesses = 0;
		int maxGuesses = 5;
		
		Scanner scanner = new Scanner(System.in);
		
		while (numberOfGuesses < maxGuesses) {
			System.out.print("Pick a number between 1  and 100: ");
			
			if (scanner.hasNextInt()) {
				int userGuess = scanner.nextInt();
				
				if (userGuess >= 1 && userGuess <= 100) {
					numberOfGuesses++;
					
					if (userGuess == theRandomNumber) {
						System.out.println("You win!\nThe number to guess was: " + theRandomNumber);
						scanner.close();
						return;
						
					}else {
						System.out.println(userGuess < theRandomNumber ? "Please pick a higher number" : "Please pick a lower number");
					
					}
				}else{
					System.out.println("Your guess is not between 1 and 100, please try again");
				}
			}else {
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.next();
			}
			
			scanner.nextLine();
		}
						if (numberOfGuesses == maxGuesses) {
                            System.out.println("You lose!\nThe number to guess was: " + theRandomNumber);
                        }//To match what the intructions said, I googled how to make text go on the line underneath instead of right next to it
						//I thought this would be easier than to write more code. "\n"
						
						scanner.close();

	}
}
