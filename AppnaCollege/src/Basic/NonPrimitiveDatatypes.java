package Basic;

public class NonPrimitiveDatatypes {

	public NonPrimitiveDatatypes() {
		
	}

	public static void main(String[] args) {
		String name = new String("Shankar");
		String name1= new String("Praju");
		String love = name1+ " Loves " +name;
		System.out.println(love);
		System.out.println(love.replace('s', ' '));
		System.out.println(love.substring(6,10));
		System.out.println(name1.charAt(4));
		System.out.println(love.substring(0,5));
		System.out.println(love.length()); 
		
		String name2= new String("Kandu");
		String name3= new String("Paru");
		String lawda= new String(name2+" Loves "+name3);
		System.out.println(lawda);
		System.out.println(lawda.replace('K', 'G'));
		System.out.println(lawda.charAt(1));
		System.out.println(lawda.charAt(2));
		System.out.println(lawda.charAt(3));
		System.out.println(lawda.charAt(4));
		System.out.println(lawda.substring(0,5));
		System.out.println(name3.length());
	}

}