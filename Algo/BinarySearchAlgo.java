import java.util.Scanner; // Used to take input from the user

public class BinarySearchAlgo {

    // This method searches for the target element using Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0; // Starting index of the search range
        int right = arr.length - 1; // Last index of the search range

        while (left <= right) { // Continue searching while a valid range exists
            int mid = left + (right - left) / 2; // Find the middle index safely
            if (arr[mid] == target) { // Check if the middle element is the target
                return mid; // Return the index because the element is found
            }
            if (target < arr[mid]) { // If target is smaller than middle element
                right = mid - 1; // Search in the left half
            } else { // If target is greater than middle element
                left = mid + 1; // Search in the right half
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to take user input

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Sorted array for Binary Search
        System.out.print("Enter the element you want : "); // Ask user for the target element
        int target = sc.nextInt(); // Read the target element from the user
        System.out.println("Found at Index: " + binarySearch(arr, target)); // Call binarySearch and print the returned index

        sc.close(); // Close the Scanner
    }
}

