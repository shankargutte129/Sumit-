package Shankar;
import java.util.Scanner;
public class Mirror_pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
			System.out.print(" ");	
		    space=space+1;
			}
			int j=1;
			int star=i;

			while(j<=i) {

				System.out.print(star);
				star=star+1;
				j=j+1;
			}int k =1;
			int dec=2*(i-1);
			while(k<=i-1) {
				System.out.print(dec);
				dec=dec-1;
				k=k+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}
	}