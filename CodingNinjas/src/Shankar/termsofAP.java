package Shankar;

import java.util.Scanner;

public class termsofAP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int UserNumber = s.nextInt();
		int i = 0;
		int start = 1;
		while (i < UserNumber) {
			int term = 3 * start + 2;
			if (term % 4 != 0) {
				System.out.print(term + " ");
				i++;
			}
			start++;
		}
	}
}