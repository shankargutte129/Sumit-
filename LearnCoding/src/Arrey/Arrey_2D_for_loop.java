package Arrey;

import java.util.Scanner;

public class Arrey_2D_for_loop {

	public static void main(String[] args) {
		
		int a [][] = new int[2][2];
		
		System.out.println("Enter arrey elements =");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++)
			{
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("matrix elements are : ");
		
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}

	}

}
