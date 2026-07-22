public class BasicAlgo {
    // /* =============> Categories of Array <================ */

    // /* Basic Implementation of Prefix Sum Algorithm [Time: O(n), Space: O(n)] */
    static int[] buildPrefix(int[] arr) { // Method to build the prefix sum array from the given array.
        int[] prefix = new int[arr.length]; // Create a new array to store the prefix sums. It has the same size as the
                                            // original array.
        prefix[0] = arr[0]; // The first prefix sum is always equal to the first element of the original
                            // array.
        for (int i = 1; i < arr.length; i++) { // Traverse the array from the second element to the last element.
            prefix[i] = prefix[i - 1] + arr[i]; // Current prefix sum = Previous prefix sum + Current array element.
        }
        return prefix; // Return the completed prefix sum array.
    }
    static int rangeSum(int[] prefix, int l, int r) { // Method to find the sum of elements from index l to r using the
                                                      // prefix sum array.
        if (l == 0) { // If the range starts from index 0, no subtraction is needed.
            return prefix[r]; // Return the prefix sum directly up to index r.
        }
        return prefix[r] - prefix[l - 1]; // Otherwise, subtract the prefix sum before index l to get the required range
                                          // sum.
    }

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

    public static void main(String[] args) {
     
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

        // /* Prefix Sum Approach */
        int[] arr3 = { 8, 12, 10, 2, 6, 15, 7 }; // Create an array whose prefix sum array will be built.
        int[] prefix = buildPrefix(arr3); // Build the prefix sum array and store it in the variable 'prefix'.
        System.out.println("Prefix sum ==> " + rangeSum(prefix, 0, 2)); // Find and print the sum of elements from index
                                                                        // 0 to index 2 using the prefix sum array.
   
        // /* as;lfka */


      }
}
