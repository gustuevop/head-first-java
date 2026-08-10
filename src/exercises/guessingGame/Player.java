<<<<<<< HEAD
package src.exercises.guessingGame;
=======
package exercises.guessingGame;
>>>>>>> ac6cbec992d5c804131b1be86e10fd5497b49bac

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
