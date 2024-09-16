package com.practice;

import java.util.Scanner;

public class BigValue {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i=1;
		int big=0;
		int n;
		
		while(i<=10)
		{
			System.out.println("enter the number");
			n=sc.nextInt();
			if(n>big)
			{
				big=n;
			}
			i++;
		}
		System.out.println("Big value : " +big);
	}
}
