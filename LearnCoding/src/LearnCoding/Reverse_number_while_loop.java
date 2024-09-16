package LearnCoding;

import java.util.Scanner;

public class Reverse_number_while_loop {

	public Reverse_number_while_loop() {
		
	}

	public static void main(String[] args) {
		
		System.out.println("Enter any number = ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num > 0)
		{
			int r = num%10;
			System.out.print(r);
			num= num/10;
		}
		
	}

}
