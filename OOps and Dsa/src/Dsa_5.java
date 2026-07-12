// import java.util.Stack;

public class Dsa_5 {

    static class Solution {

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

        // /* Question 3 -----> Check for Duplicates (Time O(n^2) & Space O(1))*/
        // public boolean containsDuplicate(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // int curr = arr[i];
        // for (int j = i + 1; j < arr.length; j++) {
        // if (curr == arr[j]) {
        // return true;
        // }
        // }
        // }
        // return false;
        // }

        // /* Question 4 -----> Two Sum (Time O(n^2) & Space O(1))*/
        // public int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] + nums[j] == target) {
        // return new int[] { i, j }; // return the indices
        // }
        // }
        // }
        // return new int[] {}; // return an empty array if no match found
        // }

        // /* Question 5 -----> To identify Valid Parentheses */
        // public boolean isValid(String s) {
        //     Stack<Character> stack = new Stack<>();
        //     char ch[] = s.toCharArray();
        //     for (int i = 0; i < s.length(); i++) {

        //     }
        //     return false;
        // }
    }

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
        // Solution sol = new Solution();
        // int[] arr = { 1, 1, 2, 4, 9 };
        // boolean isAvailable = sol.containsDuplicate(arr);
        // if (isAvailable) {
        // System.out.println("Array contains duplicates");
        // } else {
        // System.out.println("Array doesn't contains duplicates");
        // }

        // /* Question 4 -----> Two Sum */
        // Solution sol = new Solution();
        // int[] nums = { 2, 11, 15, 8 };
        // int target = 10;
        // int[] result = sol.twoSum(nums, target);
        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }
        // System.out.println();

        // /* Question 5 -----> To identify Valid Parentheses */
        // Solution sol = new Solution();
        // String s = "(){}[]";
        // boolean result = sol.isValid(s);
        // System.out.println("Is valid --> " + result);
    }
}
