package Basic;

import java.util.Arrays;

public class Arreys_1d {

	public Arreys_1d() {
		
	}

	public static void main(String[] args) {
		
		int[] govind = new int[4];
		govind[0] = 96;
		govind[1] = 89;
		govind[2] = 94;
		govind[3] = 98;

	System.out.println(govind[0]);
	System.out.println(govind.length);
	Arrays.sort(govind);
	System.out.println(govind[0]);
	
	String[]sidhu = {"deepak","shankar","govind"};
	Arrays.sort(sidhu);
	System.out.println(sidhu[0]);
	
		

	}

}
