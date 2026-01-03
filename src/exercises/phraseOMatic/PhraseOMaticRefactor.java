package exercises.phraseOMatic;

public class PhraseOMaticRefactor {

	static String[] wordListOne = {"agnostic", "opinionated",
			"voice activated", "haptically driven", "extensible",
			"reactive", "agent based", "functional", "AI enabled",
			"strongly typed"};
	
	static String[] wordListTwo = {"loosely coupled", "six sigma",
			"asynchronous", "event driven", "pub-sub", "IoT", "cloud native", 
			"service oriented", "containerized", "serverless",
			"microservices", "distributed ledger"};
	
	static String[] wordListThree = {"framework", "library",
			"DSL", "REST API", "repository", "pipeline", "service mesh", 
			"architecture", "perspective", "design",
			"orientation"};
	
	static String[] recentWords = new String[3];
	
	String phraseGenerator(String[] a, String[] b, String[] c) {
		
		int wordListOneLenght = a.length;
		int wordListTwoLenght = b.length;
		int wordListThreeLenght = c.length;
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(wordListOneLenght);
		int rand2 = randomGenerator.nextInt(wordListTwoLenght);
		int rand3 = randomGenerator.nextInt(wordListThreeLenght);
		
		recentWords[0] = wordListOne[rand1];
		recentWords[1] = wordListOne[rand1];
		recentWords[2] = wordListOne[rand1];
		
		return  wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	}
	
	boolean repetitionChecker(String[] recentWords, String generatedPhrase) {
		String[] generatedWords = generatedPhrase.split(" ");
		for (int i = 0; i < 3; i++) {
			if (generatedWords[i].contains(recentWords[i])) {
				System.out.println("\nRepetition encontered! Repetitive word: " + generatedWords[i]);
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
				
		PhraseOMaticRefactor phraseOMatic = new PhraseOMaticRefactor();
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		String builtPhrase = "";
		String userChoice = "";
		int i = 0;
		boolean run = true;
		
		while (run) {
			builtPhrase = phraseOMatic.phraseGenerator(wordListOne, wordListTwo, wordListThree);
			
			if (phraseOMatic.repetitionChecker(recentWords, builtPhrase)) {
				System.out.println("\nGenerating again!");
				builtPhrase = phraseOMatic.phraseGenerator(wordListOne, wordListTwo, wordListThree);
			}
			
			
			
			System.out.println("\nGenerated Phrase: We need a " + builtPhrase);
			System.out.println("\nWould you like to run the program again? (Y/N)");
			userChoice = scan.nextLine();
			
			if (userChoice.equals("Y")) {
				run = true;
			} else {
				run = false;
			}
		}
		scan.close();		
	}
	
}

