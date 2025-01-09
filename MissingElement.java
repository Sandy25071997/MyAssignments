package week3.day2;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {
        
        // Declare and initialize the array
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        
        Arrays.sort(arr);
        
        // Loop through the array and find the missing element
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the next element is not the consecutive number
            if (arr[i] + 1 != arr[i + 1]) {
                // Print the missing number
                System.out.println("Missing element: " + (arr[i] + 1));
                break;
            }
        }
    }
}