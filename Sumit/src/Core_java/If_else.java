package Core_java;
import java.util.Scanner;
public class If_else {

	public static void main(String[]arg) {
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		int password = sc.nextInt();
		
		if(password==15935725)
		{
			System.out.println("Hi Shankar");
			System.out.println("Welcome to TATA Family");
		}
		else
		{
			System.out.println("Wrong Password \nPlease Enter Correct Password");
		}
		
	}
}
