package Core_java;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 3) {
			System.out.println("Please enter Username");

			Scanner sc = new Scanner(System.in);
			String username = sc.nextLine();

			if (username.equals("sumit@123")) {
				while (i <= 3) {
					System.out.println("Please Enter the Password");
					String password = sc.nextLine();

					if (password.equals("123qwe")) {
						System.out.println("Hi Sumit, Welcome to the coding family");
						return;
					} else {
						System.out.println("Invalid Password");
					}
					i++;
				}
				System.out.println("you have entered wrong password three times so the account is blocked");
				return;

			} else {
				System.out.println("Incorrect username !....");
			}
			i++;
		}

		System.out.println("you have entered wrong username three times so the account is blocked");

	}

}
