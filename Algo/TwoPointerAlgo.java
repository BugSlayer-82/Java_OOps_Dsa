import java.util.Scanner;

public class TwoPointerAlgo {

    // /* Question 4 ====> Remove Duplicates from an Sorted array */
    static void removeDuplicate(int []arr){
        if(arr.length == 0){
            return;
        }
        int start = 0;
        for(int end = 1; end < arr.length; end++){
            if(arr[end] != arr[start])
                {
                    start++;
                    arr[start] = arr[end];
                }
        }
        int n = start + 1;
        System.out.println("After removed duplicates .....!");
        for(int x = 0; x < n ; x ++){
            System.out.print(arr[x] + " ");
        }
        System.out.println();
    }

    // /* Question 3 ====> Palindrome Check <==== */
    // // /* =====> In case of Number or Integer <======= */
    // static boolean isPalindrome(int []arr){
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while(start < end){
    //         if(arr[start] != arr[end]){
    //             return false;
    //         }
    //         start ++;
    //         end --;
    //     }
    //     return true;
    // }
    // // /* =====> In case of String <======= */
    // static boolean isPalindrome(String str){
    //     int start = 0;
    //     int end = str.length() - 1;
    //     while(start < end){
    //         if(str.charAt(start) != str.charAt(end)){
    //             return false;
    //         }
    //         start ++;
    //         end --;
    //     }
    //     return true;
    // }

    // /* Question 2 ====> Reverse an Array <==== */
    // static void reverse(int[] arr) {
    // int left = 0; // Points to the first element of the array
    // int right = arr.length - 1; // Points to the last element of the array
    // while (left < right) { // Continue until left and right pointers meet
    // int temp = arr[left]; // Store the left element temporarily
    // arr[left] = arr[right]; // Put the right element at the left position
    // arr[right] = temp; // Put the original left element at the right position
    // left++; // Move left pointer one step forward
    // right--; // Move right pointer one step backward
    // }
    // System.out.println("Array after reversal ...."); // Print a message before
    // displaying the reversed array
    // for (int num : arr) { // Traverse through each element of the array
    // System.out.print(num + " "); // Print the current element
    // }
    // System.out.println(); // Move the cursor to the next line
    // }

    // /* Question 1 ====> Pair sum to target <==== */
    // static boolean pairSum(int[] arr, int target) {
    // int left = 0; // Pointer starts from the first element
    // int right = arr.length - 1; // Pointer starts from the last element
    // while (left < right) { // Continue until both pointers meet
    // int sum = arr[left] + arr[right]; // Calculate the sum of the two elements
    // if (sum == target) { // Check if the sum is equal to the target
    // System.out.println("Pair : " + arr[left] + ", " + arr[right]); // Print the
    // pair
    // return true; // Return true because the required pair is found
    // }
    // if (sum < target) { // If the current sum is smaller than the target
    // left++; // Move left pointer forward to increase the sum
    // } else { // If the current sum is greater than the target
    // right--; // Move right pointer backward to decrease the sum
    // }
    // }
    // return false; // Return false if no pair with the target sum is found
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // /* Question 1 ====> Pair sum to target <==== */
        // int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 }; // Create a sorted integer array
        // System.out.print("Enter your target : "); // Ask the user to enter the target
        // sum
        // int target = sc.nextInt(); // Read the target value from the user
        // System.out.println(pairSum(arr, target)); // Call pairSum() and print the
        // result

        // /* Question 2 ====> Reverse an Array <==== */
        // int[] arr = { 1, 2, 5, 6, 7, 8, 9 }; // Create an integer array
        // System.out.println("Array before reversal ..."); // Print a message before
        // reversal
        // for (int num : arr) { // Traverse through every element of the array
        // System.out.print(num + " "); // Print each element
        // }
        // System.out.println(); // Move to the next line
        // reverse(arr); // Call the reverse method and pass the array

        // /* Question 3 ====> Palindrome Check <==== */
        // // /* =====> In case of Number or Integer <======= */
        // int [] arr = {1,1,2,3,1};
        // System.out.println("Palindrome : "+ isPalindrome(arr));
        // // /* =====> In case of String <======= */
        // String str = "madaam";
        // System.out.println("Palindrome : " + isPalindrome(str));

        // /* Question 4 ====> Remove Duplicates from an Sorted array */
        int []arr = {1,1,2,2,3,3,4,4,5,5};
        System.out.println("Original array ....!");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
        removeDuplicate(arr);
        
        
        sc.close();
    }
}
