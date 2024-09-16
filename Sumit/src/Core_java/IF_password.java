package Core_java;
import java.util.Scanner;
public class IF_password {

	public static void main(String[] args) {
		int password;
		System.out.println("Enter the password");
		Scanner sc=new Scanner(System.in);
		password=sc.nextInt();
		
		if(password==12345678) {
			System.out.println("Welcome to The honda family");
		}

	}

}
