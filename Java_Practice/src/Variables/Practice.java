package Variables;

public class Practice {
	
	
	int a;
	static int b;
	
	public static void main(String[] args) {

		System.out.println("program started");

		for (int number = 20; number > 0; number--) {

			if (number == 12) {
				break;
			}

			System.out.println(number);

		}

		System.out.println("program ended");

	}

	protected static void addNumbers() {
		System.out.println("add munbers");
	}
}