package BasicPrograms;

public class Solution {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int arr[] = { 2, 13, 4, 1, 3, 6 };
		selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {
		// Your code goes here
		int n = arr.length - 1;
		for (int i = 0; i <= n - 1; i++) {
			for (int j = 1; j <= n; j++) {

				if (arr[i] > arr[j]) {
					System.out.println(arr[i] + "-" + arr[j]);
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}