package LoopingStatment;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(a+"x"+i+" = "+a*i);
			
		}

	}

}
