import java.util.Scanner;

public class calculator{


public static void main(String args[]){

float a,b;

Scanner sc = new Scanner(System.in);

System.out.print("Enter first number = ");
a = sc.nextInt();

System.out.print("Enter Second number = ");
b = sc.nextInt();

System.out.println("The Addition of given numbers is = "+(a+b));
System.out.println("The Substraction of given numbers is = "+(a-b));
System.out.println("The Multiplication of given numbers is = "+(a*b));
System.out.println("The Division of given two numbers is = "+(a/b));

}


}