package LearnCoding;

import java.util.Scanner;

public class username_password_if_else {

	public username_password_if_else() {
		
	}

	public static void main(String[] args) {
		
	System.out.print("Enter Username = ");
	Scanner sc= new Scanner(System.in);
	String username = sc.nextLine();
	
	System.out.print("Enter Password = ");
	int password = sc.nextInt();
	
//	if(username == sgutte)
		if(password == 72767130)
			{
				System.out.println("Welcome Shankar");
				System.out.println("Please find the below details");
				System.out.println("Name : Shankar Yadav Gutte");
				System.out.println("Address : Raje Shivaji Nagar Latur");
				System.out.println("Contact : 7276713070");
				System.out.println("Thanks for login");
			}
			else
			{
				System.out.println("Please Enter Valid username or password");
			}
	
		

	}

}
