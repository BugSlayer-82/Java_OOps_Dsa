public class PrefixSumAlgo {
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

    public static void main(String[] args) {
        // /* Prefix Sum Approach */
        int[] arr3 = { 8, 12, 10, 2, 6, 15, 7 }; // Create an array whose prefix sum array will be built.
        int[] prefix = buildPrefix(arr3); // Build the prefix sum array and store it in the variable 'prefix'.
        System.out.println("Prefix sum ==> " + rangeSum(prefix, 0, 2)); // Find and print the sum of elements from index
                                                                        // 0 to index 2 using the prefix sum array.

    }
}
