package Core_java;
import java.util.Scanner;

public class AlphaNumericPass {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the TATA, please enter the password!!");
		
		Scanner Sc = new Scanner(System.in);
		
		String password= Sc.nextLine();
		
		if(password.equals("Tcs@9007"))
		{
			System.out.println("Hi Sumit \nWelcome to the TATA Family");
		}
		
		else
		{
			System.out.println("Please enter correct password");
		}
		
		

	}

}
