package Core_java;
import java.util.Scanner;

public class GreaterNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is greater than others");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is greater than others");
		}
		else {
			System.out.println(c+" is greater than others");
		}
		

	}

}
