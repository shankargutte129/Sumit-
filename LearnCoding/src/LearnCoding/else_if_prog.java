package LearnCoding;

import java.util.Scanner;

public class else_if_prog {

	public else_if_prog() {
	
	}

	public static void main(String[] args) {
		System.out.println("Enter your Percentage");
		Scanner sc = new Scanner(System.in);
		double percentage = sc.nextDouble();
		
		if(percentage >=80 && percentage <=100) 
		{
			System.out.println("Congratulation you are collified the exam with gread A");
		}
		else if(percentage>=60 && percentage <=80) 
		{
			System.out.println("Congratulation you are collified the exam with gread B");
			System.out.println("you can do better");
		}
		else if(percentage>=40 && percentage <=60)
		{
			System.out.println("Congratulation you are collified the exam with gread C");
			System.out.println("you can do better");
		}
		else if (percentage<=40)
			
		{
			System.out.println("You are failed in exam");
			System.out.println("Don't loos the hopes....");
			System.out.println("You can do it");
		}
	}

}
