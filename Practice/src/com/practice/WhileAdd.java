package com.practice;

import java.util.Scanner;

public class WhileAdd {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i=1,sum=0, n;
		
		
		
		while(i<=10)
		{
			System.out.println("Enter the number");
			n=sc.nextInt();
			sum=sum+n;
			i++;
		}
		System.out.println("Sum of all 10 values: " + sum);
		
	}

}
