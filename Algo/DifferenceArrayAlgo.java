public class DifferenceArrayAlgo {
    // /* =============> Categories of Array <================ */
    // /* Basic Implementation of Moore's Voting Algorithm [Time: O(n), Space: O(1)]
    // */

    // /* Basic Implementation of Difference Array Algorithm [Time: O(n) , Space:
    // O(n)] */
    static int[] buildDifference(int[] arr4) { // Method to build the Difference Array from the given array.
        if (arr4.length < 0) { // Check whether the array length is less than 0.
            return new int[] {}; // Return an empty array.
        }
        int[] diff = new int[arr4.length]; // Create a new array to store the difference values.
        diff[0] = arr4[0]; // The first element of the difference array is always the same as the first
                           // element of the original array.
        for (int i = 1; i < arr4.length; i++) { // Traverse the original array starting from index 1.
            diff[i] = arr4[i] - arr4[i - 1]; // Store the difference between the current element and the previous
                                             // element.
        }
        return diff; // Return the completed difference array.
    }

    static int[] rangeUpdate(int[] diff, int l, int r, int value) { // Method to update all elements from index l to r
                                                                    // using the Difference Array.
        diff[l] += value; // Add the update value at the starting index of the range.
        if (r + 1 < diff.length) { // Check whether the position after the ending index exists.
            diff[r + 1] -= value; // Subtract the update value after the ending index to stop the effect of the
                                  // update.
        }
        int[] arr = new int[diff.length]; // Create a new array to rebuild the updated original array.
        arr[0] = diff[0]; // The first element of the rebuilt array is the same as the first element of
                          // the difference array.
        for (int i = 1; i < diff.length; i++) { // Traverse the difference array from index 1.
            arr[i] = arr[i - 1] + diff[i]; // Reconstruct the original array by taking the prefix sum of the difference
                                           // array.
        }
        return arr; // Return the updated original array.
    }

    public static void main(String[] args) {

        // /* Difference Array Approach */
        int[] arr4 = { 10, 20, 30, 40, 50 }; // Create the original array on which the range update operation will be
                                             // performed.
        int[] diff = buildDifference(arr4); // Build the Difference Array from the original array and store it in
                                            // 'diff'.
        arr4 = rangeUpdate(diff, 0, 3, 5); // Add the value 5 to all elements from index 0 to index 3 and return the
                                           // updated array.
        System.out.println("Final updated array."); // Print a heading before displaying the updated array.
        for (int i : arr4) { // Traverse each element of the updated array using the enhanced for-each loop.
            System.out.print(i + " "); // Print each updated element followed by a space.
        }
        System.out.println(); // Move the cursor to the next line after printing all elements.

    }
}
