package week1.day2;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        int output = 0, temp = input;
        while (temp > 0) {
            int lastDigit = temp % 10;
            output = (output * 10) + lastDigit;
            temp /= 10;
        }

        if (input == output) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        scan.close();
    }
}