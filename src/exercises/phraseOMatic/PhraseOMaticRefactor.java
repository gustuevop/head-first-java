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
	
	String[] recentPhrases = new String[3];
	
	String phraseGenerator(String[] a, String[] b, String[] c) {
		
		int wordListOneLenght = a.length;
		int wordListTwoLenght = b.length;
		int wordListThreeLenght = c.length;
		
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(wordListOneLenght);
		int rand2 = randomGenerator.nextInt(wordListTwoLenght);
		int rand3 = randomGenerator.nextInt(wordListThreeLenght);
		
		return wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
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
			System.out.println("We need a " + builtPhrase);
			phraseOMatic.recentPhrases[i] = builtPhrase;
			i++;
			
			System.out.println("Would you like to run the program again? (Y/N)");
			userChoice = scan.nextLine();
			
			if (userChoice.equals("Y")) {
				run = true;
			} else {
				run = false;
			}
						
			if (i == 3) {
				i = 0;
			}
		}
		scan.close();		
	}
	
}

