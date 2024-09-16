package Core_java;
import java.util.Scanner;
public class UserIdPassword {

	public static void main(String[] args) {
		
		System.out.println("Enter username");
		Scanner sc = new Scanner(System.in);
		String username = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		
		if(username.equals("sgutte") && password.equals("Shankar@1997"))
		{
			System.out.println("Hi Shankar\nWelcome to the page");
		}
		else
		{
			System.out.println("Wrong username or password \nPlease Enter valid username or password ");
		}

	}

}
