<<<<<<< HEAD
package src.exercises.codeMagnets;
=======
package exercises.codeMagnets;
>>>>>>> ac6cbec992d5c804131b1be86e10fd5497b49bac

public class Shuffle1 {

	public static void main(String[] args) {
		int x = 3;
		
		while (x > 0) {
			
			if (x > 2) {
				System.out.print("a");
			}
			
			if (x == 2) {
				System.out.print("b c");
			}
			
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			
			if (x > 0) {
				x = x - 1;
				System.out.print("-");
			}
			
		}
		
	}
	
}