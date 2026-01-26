package exercises.poolPuzzle;

public class EchoPuzzle {
	int count = 0;
	
	void hello() {
		System.out.println("helloooo... ");
	}
	
	public static void main(String[] args) {
		
		EchoPuzzle e1 = new EchoPuzzle();
		EchoPuzzle e2 = new EchoPuzzle();
		int x = 0;
		
		while (x < 4) {
			e1.hello();
			e1.count = e1.count + 1;
			if (x < 3) {
				e2.count = e2.count + 1;
			}

			if (x > 1) {
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
		System.out.println(e2.count);
	}
}