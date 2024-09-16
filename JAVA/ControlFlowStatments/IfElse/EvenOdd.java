package IfElse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
	   int	num ;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Please enter any number = ");
	   
	   num = sc.nextInt();
	   
	   if(num%2==0) 
	   {
		   System.out.println("Given number is even number");
	   }
	   else
	   {
		   System.out.println("Given number is odd number");
	   }	   

	}

}
