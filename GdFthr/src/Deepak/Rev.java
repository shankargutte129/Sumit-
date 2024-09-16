package Deepak;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = 0;

		for (int i=1; i<=n;) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;

		}
		System.out.println(rev);

	}

}
