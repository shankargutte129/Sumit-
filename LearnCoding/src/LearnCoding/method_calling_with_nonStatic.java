package LearnCoding;

public class method_calling_with_nonStatic {

	public static void main(String[] args) {
		
		method_calling_with_nonStatic m=new method_calling_with_nonStatic();
		
		int r = m.subtract(55,61); // calling
		System.out.println("Subtraction is = "+r);
	}
	int subtract(int a, int b) // Defining
	{
		return a-b;
	}

}

// use class name while creating object for non static method calling