public class MooresVotingAlgo {
    static int majorityElement(int[] arr) {// Finds the majority element using Moore's Voting Algorithm
        int candidate = 0;// Stores the current possible majority element
        int count = 0;// Stores the vote count of the current candidate
        for (int i = 0; i < arr.length; i++) {// First pass: find a possible majority candidate
            if (count == 0) {// If count becomes 0, choose the current element as a new candidate
                candidate = arr[i];
            }
            if (arr[i] == candidate) {// If the current element is same as candidate, increase its vote
                count++;
            } else {// If the current element is different, cancel one vote
                count--;
            }
        }
        count = 0;// Reset count to verify whether the candidate is actually a majority element

        for (int num : arr) {// Second pass: count how many times the candidate actually appears
            if (num == candidate) {// If the element is equal to the candidate, increase the count
                count++;
            }
        }
        if (count > arr.length / 2) { // A majority element must appear more than n/2 times
            return candidate;// Return the candidate because it is a valid majority element
        }
        return -1; // Return -1 if there is no majority element
    }

    public static void main(String[] args) {
        int[] arr = { 3, 3, 1, 3, 3, 5, 2 };// Create an array of elements
        System.out.println("Majority element is : " + majorityElement(arr));// Call majorityElement() and print the
                                                                            // result
    }
}