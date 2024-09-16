package Shankar;
import java.util.Scanner;

public class Char_pattern {

	public static void main(String[] args) {
		
System.out.println("Enter any number = ");
		
Scanner S = new Scanner(System.in);

int p = S.nextInt();
int i= 1;



while(i<=p)
{char ch=(char)('A'+p-i);
	int j = 1;
	
	while(j<=i)
	{
		System.out.print(ch);
		ch++;
		j++;
	}
	System.out.println();
	i++;
	}

	}

}
