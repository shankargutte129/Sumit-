package Deepak;
import java.util.Scanner;

public class largestamongfourdigits {
	public class Solution {
	    
	    public static int max_number(int n){
	                
	      	int maxNum = 0;
			int i = 1;
			while (n / i > 0) {
				int newNum = (n / (i * 10)) * i + n % i;
				i = i * 10;
				if (maxNum < newNum) {
					maxNum = newNum;
				}
			}
			return maxNum;
		}



	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.max_number(n));
		s.close();

	}

	}
	    




}
