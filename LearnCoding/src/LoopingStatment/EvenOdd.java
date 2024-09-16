package LoopingStatment;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter the number still what number you want the even numbers");
		Scanner Sc= new Scanner(System.in);
		int a = Sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			if (i%2==0) 
			{
				System.out.println(i);
			}
		}

	}

}
