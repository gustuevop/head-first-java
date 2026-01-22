package exercises.guessingGame;

import java.util.Scanner;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	boolean keepRunning = true;
	int randomNumber;
	Scanner sc;

	public void start() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		sc = new Scanner(System.in);
		int maxResult = 10;

		System.out.println("Welcome to the ultimate Guess Game!\n");
		System.out.println("I'm thinking of a random number between 0 and " + (maxResult - 1) + "...\n");
		randomNumber = generateRandomNumber(maxResult);
		
		while (keepRunning) {
			System.out.println("The target number is: " + randomNumber);
			System.out.println();
			
			p1.guess(maxResult, sc);
			p2.guess(maxResult, sc);
			p3.guess(maxResult, sc);
			
			System.out.println("All players done guessing! Let's check if we have a winner...\n");
			
			System.out.println("Player 1 guess:");
			System.out.println(p1.guess);
			
			System.out.println("\nPlayer 2 guess:");
			System.out.println(p2.guess);
			
			System.out.println("\nPlayer 3 guess:");
			System.out.println(p3.guess);
			
			checkResult(p1);
			checkResult(p2);
			checkResult(p3);
			
			if (p1.isRight || p2.isRight || p3.isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1.isRight);
				System.out.println("Player one got it right? " + p2.isRight);
				System.out.println("Player one got it right? " + p3.isRight);
				System.out.println("Game is over!");
				keepRunning = false;
			} else {
				System.out.println("Players will have to try it again!");
			}
			
		}
		sc.close();
	}
	
	 void checkResult(Player p) {
		if (p.guess == randomNumber) {
			p.isRight = true;
		}
	}

	public int generateRandomNumber(int maxResult) {
		return (int) (Math.random() * maxResult);
	}

}
