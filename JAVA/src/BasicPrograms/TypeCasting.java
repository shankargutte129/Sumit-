package BasicPrograms;

public class TypeCasting {
	public static void main(String[] args) {
//		int i = 20;
//		long l = i;
//
//		char c = 'a';
//		int charNumber = c;
//		System.out.println(charNumber);
//		for(char c='A'; c<='Z';c++) {
//			int charNumber =c;
//			System.out.println(charNumber);
//		}
//		for(char c='a'; c<='z';c++) {
//			int charNumber =c;
//			System.out.println(charNumber);
//		}

		int[] res = Alphabets();
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static int[] Alphabets() {
		int arr[] = new int[26];
		int number = 0;
		for (char c = 'A'; c <= 'Z'; c++) {

			int charNumber = c;
			arr[number] = charNumber;
			number++;
		}
		return arr;
	}
}
