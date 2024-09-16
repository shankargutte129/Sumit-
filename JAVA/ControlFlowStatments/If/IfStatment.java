package If;

import java.util.Scanner;

public class IfStatment {

	public static void main(String[] args) {
		int password;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the password");
		password = sc.nextInt();
		
		if(password==159357) 
		{
			System.out.println("Welcome Shankar Please find your below details");
			
		    System.out.println("Name = Shankar Yadav Gutte");
		    
		    System.out.println("Address = Raje Shivaji Nagar, Latur");
		    
		    System.out.println("Pincode = 413512");
		    
		    System.out.println("Contact Number = 7276713070");
		}
	}

}
