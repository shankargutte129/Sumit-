package Core_java;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		System.out.println("Please enter input");
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
		if(number>=80) {
			System.out.println("Distinction");
		}
		else if(number>=60 && number<=80)
		{
			System.out.println("First Class");
		}
		else if(number>=40 && number<=60)
		{
			System.out.println("Second Class");
		}
		else if(number<40)
		{
			System.out.println("fail");
		}

	}

}
