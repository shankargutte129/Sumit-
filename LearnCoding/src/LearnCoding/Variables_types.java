package LearnCoding;

public class Variables_types {

	int a=10; //instance variable
	static double b=20.5; // Static variable
	public Variables_types() {
		
	}

	public static void main(String[] args) {
		
		boolean c = true;//Local variable
		//To run instance variable we need to create object of class name
		
		Variables_types s= new Variables_types();
		
		System.out.println("Value of instance variable is = " +s.a);
		System.out.println("the value of Instance variable is = " +b);
		System.out.println("The value of local variable is = " +c);
		System.out.println(s.a +" "+b+" "+c);
	}

}
