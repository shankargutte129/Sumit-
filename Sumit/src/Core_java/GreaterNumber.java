package Core_java;
import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter any three Numbers");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && b>c)
		{
			System.out.println("The largest number is " +a);
		}
		else if (b>a && a>c)
		{
			System.out.println("The largest number is " +b);
		}
		else
		{
			System.out.println("The largest number is " +c);
		}
	}

}