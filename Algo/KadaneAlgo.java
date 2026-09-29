public class KadaneAlgo {
    // /* Basic Implementation of Kadane's Algorithm (Standard Approach & Best
    // Approach) [Time Complexity: O(n)] */
    static int kadaneStandard(int[] arr) { // Method to find the maximum subarray sum using the standard Kadane's
                                           // Algorithm.
        int currSum = arr[0]; // Store the current maximum subarray sum ending at the current index. Start
                              // with the first element.
        int maxSum = arr[0]; // Store the overall maximum subarray sum found so far. Initialize it with the
                             // first element.
        for (int i = 1; i < arr.length; i++) { // Traverse the array starting from index 1 because index 0 is already
                                               // used for initialization.
            currSum = Math.max(currSum, currSum + arr[i]); // Compare two choices:
                                                           // 1. Keep the current subarray by adding the current
                                                           // element.
                                                           // 2. Continue with the existing current sum (as written in
                                                           // this code).
                                                           // Store the larger value in currSum.
            maxSum = Math.max(currSum, maxSum); // Compare the current subarray sum with the maximum sum found so far
                                                // and store the larger one.
        }
        return maxSum; // Return the maximum subarray sum found in the entire array.
    }

    // /* Basic Implementation of Kadane's Algorithm (Simple Approach) */
    static int kadaneSimple(int[] arr) { // Method to find the maximum subarray sum using Kadane's Algorithm.
        int sum = 0; // Store the current subarray sum while traversing the array.
        int maxSum = Integer.MIN_VALUE; // Store the maximum subarray sum found so far. Initialized with the smallest
                                        // possible integer so that negative arrays are also handled.
        for (int i = 0; i < arr.length; i++) { // Traverse each element of the array one by one.
            sum += arr[i]; // Add the current element to the current subarray sum.
            if (sum > maxSum) { // Check whether the current sum is greater than the maximum sum found so far.
                maxSum = sum; // Update the maximum sum with the current sum.
            }
            if (sum < 0) { // If the current sum becomes negative, it cannot help in getting a larger sum
                           // ahead.
                sum = 0; // Reset the current sum and start a new subarray from the next element.
            }
        }
        return maxSum; // Return the maximum subarray sum found in the array.
    }
    public static void main(String[]args){

         // /* Kadane's through Simple Approach */
         int[] arr1 = { 2, -10, 12, -5, 6 }; // Create an array on which the Simple Kadane's Algorithm will be applied.
         int result1 = kadaneSimple(arr1); // Call the kadaneSimple() method and store the maximum subarray sum in
                                           // result1.
         System.out.println("Max Sum of simple ==> " + result1); // Print the maximum subarray sum returned by the Simple
                                                                 // Kadane's Algorithm.
 
         // /* Kadane's through Standard Approach */
         int[] arr2 = { 2, -10, 12, -5, 6 }; // Create another array on which the Standard Kadane's Algorithm will be
                                             // applied.
         int result2 = kadaneStandard(arr2); // Call the kadaneStandard() method and store the maximum subarray sum in
                                             // result2.
         System.out.println("Max Sum standard ==> " + result2); // Print the maximum subarray sum returned by the
                                                                // Standard Kadane's Algorithm.
 
        
    }
}
