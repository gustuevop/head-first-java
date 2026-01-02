package exercises.phraseOMatic;

public class PhraseOMatic {

	String[] wordListOne = {"agnostic", "opinionated",
			"voice activated", "haptically driven", "extensible",
			"reactive", "agent based", "functional", "AI enabled",
			"strongly typed"};
	
	String[] wordListTwo = {"loosely coupled", "six sigma",
			"asynchronous", "event driven", "pub-sub", "IoT", "cloud native", 
			"service oriented", "containerized", "serverless",
			"microservices", "distributed ledger"};
	
	String[] wordListThree = {"framework", "library",
			"DSL", "REST API", "repository", "pipeline", "service mesh", 
			"architecture", "perspective", "design",
			"orientation"};
	
	int wordListOneLenght = wordListOne.length;
	int wordListTwoLenght = wordListTwo.length;
	int wordListThreeLenght = wordListThree.length;
	
	java.util.Random randomGenerator = new java.util.Random();
	int rand1 = randomGenerator.nextInt(wordListOneLenght);
	int rand2 = randomGenerator.nextInt(wordListTwoLenght);
	int rand3 = randomGenerator.nextInt(wordListThreeLenght);
	
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
	public static void main(String[] args) {
		PhraseOMatic phraseOMatic = new PhraseOMatic();
		System.out.println("We need a " + phraseOMatic.phrase);
	}
	
}

