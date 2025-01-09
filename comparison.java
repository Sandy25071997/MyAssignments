package week3.day2;

public class comparison {

	public static void main(String[] args) {

		// Declared two arrays
		int a[] = { 3, 101, 11, 44, 6, 777 };
		int b[] = { 1, 101, 8, 44, 9, 777 };

		// for loop to compare elements of both arrays
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				// Compare elements from both arrays
				if (a[i] == b[j]) {
					System.out.println("Matching element: " + a[i]);
				}
			}
		}
	}
}