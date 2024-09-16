package BasicPrograms;

public class Variables {
	int a = 10; // Instance variable (need to create object for instance variable)
	
	static Boolean b = true; // Static Variable

	public static void main(String[] args) {
		long c = 727671307; // Local Variable
		
		Variables s = new Variables(); // Variable deceleration
		
		System.out.println(s.a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(s.a +" "+ b +" "+c);
	}

}
