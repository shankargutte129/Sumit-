package LoopingStatment;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		long i = sc.nextInt(); // 5*4*3*2*1
		long output = 1;

		for (; i > 0; i--) {
			output = output * i;
			
		}
		System.out.println(output);

	}

}
