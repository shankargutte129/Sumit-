package Core_java;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter any number");
		
		int no=sc.nextInt();
		
		if(no%2==0) {
			System.out.println("It is even number");
		}
		else {
			System.out.println("It is odd nummber");
		}
	}

}
