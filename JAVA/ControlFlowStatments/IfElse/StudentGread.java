package IfElse;

import java.util.Scanner;
public class StudentGread {

	public static void main(String[] args) {
		
		int percentage;
		
		Scanner sc = new Scanner(System.in);
	 
		System.out.println("Please enter your percentage");
		
		percentage = sc.nextInt();
		
		if(percentage >=80)  
		{
			System.out.println("Congratulation you are passed with gread A");
		}
		else if((percentage>=60)&&(percentage<80)) 
		{
			System.out.println("Congratulation you are passed with gread B");
		}
		else if((percentage>=40) && (percentage<60)) 
		{
			System.out.println("Congratulation you are passed with gread c");
		}
		else if((percentage>=35)&&(percentage<40)) 
		{
			System.out.println("You have passed your exam but you need to improve ypur skills");
		}
		else if(percentage<35)
		{
			System.out.println("Sorry you are failed");
		}
	}

}
