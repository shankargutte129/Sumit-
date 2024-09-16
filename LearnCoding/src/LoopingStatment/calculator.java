package LoopingStatment;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("enter how much element you want to calculate");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int b;
		int output=0;
		for( ; i>=1; i--)
		{
			b = sc.nextInt();
			output = output+i;
		}
		System.out.println(output);
	}

}
