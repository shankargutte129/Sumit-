package LearnCoding;
import java.util.Scanner;
public class turnary_operator {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter any three numbers =");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int r=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("The Greator Number is = "+r);
	}

}