package Shankar;

import java.util.Scanner;

public class Student {

	public Student() {
		
	}

	public static void main(String[] args) {
		int m1,m2,m3,marks,total;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the studet = ");
		String Str = sc.next();
		
		System.out.println("Enter marks of M1 = ");
		m1 = sc.nextInt();
		System.out.println("Enter marks of M2 = ");
		m2 = sc.nextInt();
		System.out.println("Enter marks of m3");
		m3 = sc.nextInt();

		total = m1+m2+m3;
		marks=total/3;

		System.out.println("Student got : "+marks+"%");

	}

}
