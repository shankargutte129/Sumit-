package Shankar;
 import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=s.nextInt();
    int sum=0;
    
    		
    	if(c==1) {
    		for(int i=0;i<=n;i++) {
    	    	sum=sum+i;
    		}
    		System.out.println(sum);
    }
    	else if (c==2) {
    		
    		int product=1;
    	    
    	    for(int i=1;i<=n;i++) {
    	    	product=product*i;
    	    }
            System.out.println(product);	
        		
    }
    	else {
    		System.out.println(-1);
    	}
    
	}
	

}
