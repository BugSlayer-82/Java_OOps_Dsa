class Solution {

    // /* Question 1 ----> Sum of Array */
    // public int sumArray(int[] arr) {
    // int sum = 0;
    // for (int i : arr) {
    // sum += i;
    // }
    // return sum;
    // }

    // /* Question 2 -----> Reverse a String (Time & Space O(n)) */
    // public String reverseString(String s) {
    // int n = s.length();
    // char[] ch = s.toCharArray();
    // for (int i = 0; i < n / 2; i++) {
    // char currCh = ch[i];
    // ch[i] = ch[n - i - 1];
    // ch[n - i - 1] = currCh;
    // }
    // return new String(ch);
    // }

    // /* Question 3 -----> Check for Duplicates */
    public boolean containsDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (curr == arr[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }
}

public class OOps_dsa_6 {
    public static void main(String[] args) {
        // /* Question 1 ----> Sum of Array */
        // Solution sol = new Solution();
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int result = sol.sumArray(arr);
        // System.out.println("Sum ==> " + result);

        // /* Question 2 -----> Reverse a String */
        // Solution sol = new Solution();
        // String str = "hello";
        // String result = sol.reverseString(str);
        // System.out.println("Reversed ==> " + result);

        // /* Question 3 -----> Check for Duplicates */
        Solution sol = new Solution();
        int[] arr = { 1, 10, 2, 4, 9, 0 };
        boolean isAvailable = sol.containsDuplicate(arr);
        if (isAvailable) {
            System.out.println("Array contains duplicates");
        } else {
            System.out.println("Array doesn't contains duplicates");
        }
    }
}
