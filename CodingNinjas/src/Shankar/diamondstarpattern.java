package Shankar;
import java.util.Scanner;
public class diamondstarpattern {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
while(i<=n) {
	int space=1;
			while(space<=n-i) {
				System.out.print(' ');
				space=space+1;
			}
			int star=1;
			while(star<=2*(i-1)) {
				System.out.print('*');
				star=star+1;
			}
			int space2=n-i+1;
			while(space<=1) {
				System.out.print(' ');
				space2=space2-1;
			}
			int star2=2*(i-1);
			while (star2<=1) {
				System.out.print('*');
				star2=star-1;
				
			}
			  System.out.println();
			  i=i+1;
            }
}
}
