package Arrey;

import java.util.Scanner;

public class Arrey_1D_with_for_each {

	public static void main(String[] args) {
		
		int a [] = new int[5];
		
		System.out.println("Enter array elements");
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=4;i++) 
		{
			a[i]=sc.nextInt();
		}
		for (int b:a) 
		{
			System.out.print(b+" ");
		}

	}

}