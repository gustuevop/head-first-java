<<<<<<< HEAD
package src.exercises.codeMagnets;
=======
package exercises.codeMagnets;
>>>>>>> ac6cbec992d5c804131b1be86e10fd5497b49bac

public class TestArrays {
	public static void main(String[] args) {
		int y = 0;
		int ref;
		
		String [] islands = new String[4];
		int [] index = new int[4];
		
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		//The big point here is this scrambling above. The code makes the position "x" of one array be the "y" of another.
		
		while (y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(islands[ref]);
			y = y + 1;
		}
	}
}
