package week3.day2;

public class ReverseString {

	public static void main(String[] args) {

		// Given String
		String companyName = "TestLeaf";

		// Convert the String to a character array
		char[] charArray = companyName.toCharArray();

		// Loop through the character array from the end to the start
		System.out.print("Reversed String: ");
		for (int i = charArray.length - 1; i >= 0; i--) {
			// Print each character in reverse order
			System.out.print(charArray[i]);
		}
	}
}
