package Core_java;
import java.util.Scanner;

public class If_Else_Ladder {

	public static void main(String[] args) {
		String Username, Password;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");
		Username=sc.nextLine();
		
		System.out.println("Enter Password");
		Password=sc.nextLine();
		if(Username.equals("Sumit9007@gmail.com")|| Password.equals("Sumit@9007"))
		{
			if(!Username.equals("Sumit9007@gmail.com"))
			{
				System.out.println("Please enter valid username");
			}
			else if(!Password.equals("Sumit@9007")) {
				System.out.println("Please enter valid password");
			}
			else if(Username.equals("Sumit9007@gmail.com")&& Password.equals("Sumit@9007"))
			{
				System.out.println("Welcome to TATA Consultancy Services");
			}
				
		}
		else
		{
			System.out.println("Please enter valid username  and password");
		}
		
	}

}