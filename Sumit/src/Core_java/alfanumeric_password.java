package Core_java;
import java.util.Scanner;

public class alfanumeric_password {

	public static void main(String[] args) {
		
		System.out.println("Enter Password");
		Scanner sc = new Scanner(System.in);
		
		String password = sc.nextLine();
		
		if(password.equals("Tcs@9007"))
		{
			System.out.println("Hi Sumit \nWelcome to TATA Family");
		}
		else
		{
			System.out.println("Please Enter Correct password");
		}
	}

}
