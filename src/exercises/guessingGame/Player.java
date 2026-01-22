package exercises.guessingGame;

import java.util.Scanner;

public class Player {
	
	int guess;
	boolean isRight;
	
	public int guess(int max, Scanner sc) {
		System.out.println("Guess a number up to " + (max - 1));
		guess = sc.nextInt();
		return guess;
	}

}
