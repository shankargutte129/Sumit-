import java.util.Scanner;
class Addition{


	public static void main(String args[])
	{
		int a,b;
		
	Scanner sc = new Scanner(System.in);
	  System.out.println("Enter first Number =");

		a = sc.nextInt();

	  System.out.println("Enter Second number =");
		b = sc.nextInt();


		System.out.println("The Addition of given numbers is =" +(a+b));
}

}