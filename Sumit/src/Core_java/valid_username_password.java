package Core_java;
import java.util.Scanner;
public class valid_username_password {

	public static void main(String[] args) {
		String Username,Password;
		
		System.out.println("Enter Username");
		Scanner sc=new Scanner(System.in);
		Username=sc.nextLine();
		if(Username.equals("Sumit9007@gmail.com"))
		{
		
			System.out.println("Please Enter Password");
		}
		else
		{
			System.out.println("Please Enter Valid Username");
		
		}
		
		Password=sc.nextLine();
		
		
		if(Password.equals("Sumit@9007"))
		{
		
			System.out.println("Welcome to the Jagdamb Welding Works");
		}
		else 
		{
			System.out.println("Please Enter Valid Password");
		}
		
		
		

	}

}
