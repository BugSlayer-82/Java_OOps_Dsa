import java.util.Vector;

public class OnlyDsaTwoPointer_8 {
    // /* Question 5 --> Two Sum on Sorted Vector */
    // static int[] twoSum(int[] arr, int target) {
    // Vector<Integer> list = new Vector<>();
    // for (int i : arr) {
    // list.add(i);
    // }
    // int left = 0;
    // int right = list.size() - 1;
    // while (left < right) {
    // int curr = list.get(left) + list.get(right);
    // if (curr == target) {
    // return new int[] { left, right };
    // } else if (curr < target) {
    // left++;
    // } else {
    // right--;
    // }
    // }
    // return new int[] {};
    // }

    // /* Question 3 --> Remove duplicate from sorted vector */
    static void removeDuplicates(int []arr){
        Vector<Integer> list = new Vector<>();
        for(int i : arr){
            list.add(i);
        }
        int slow = 0;
        for(int fast = 1; fast < list.size(); fast++){
            if(list.get(fast) != list.get(slow)){
                slow ++;
                list.set(slow,list.get(fast));
            }
        }
        System.out.println(list);
    }

    // /* Question 2 --> Palindrome Check */
    // static boolean isPalindrome(int [] arr){ // Method to check palindrome
    // int left = 0; // Left pointer
    // int right = arr.length - 1; // Right pointer
    // while(left < right){
    // if(arr[left] != arr[right]){ // If left is not equals to right than return
    // false
    // return false;
    // }
    // left ++; // Increament by one
    // right --; // Decreament by one
    // }
    // return true; // Return true
    // }

    // /* Question 1 --> Reverse a Vector */
    // static void reverseVector(int [] arr){ // Method to reverse a vector
    // Vector<Integer> list = new Vector<>();
    // for(int i : arr){ // Iterate through each element of arr to add into vector
    // list.add(i); // Add element to list
    // }
    // System.out.println(list);
    // int left = 0; // Start or left pointer
    // int right = list.size() -1; // End or right pointer
    // while(left < right){
    // int temp = list.get(left);
    // list.set(left,list.get(right));
    // list.set(right,temp);
    // left ++; // Increament the left pointer by one
    // right --; // Decreament the right pointer by one
    // }
    // System.out.println(list);
    // }
    public static void main(String[] args) {
        // /* Question 1 --> Reverse a Vector */
        // int [] arr = {2,5,1,6,8,9};
        // reverseVector(arr);

        // /* Question 2 --> Palindrome Check */
        // int []arr = {1,2,4};
        // System.out.println("Palindrome : " + isPalindrome(arr));

        // /* Question 3 --> Remove Duplicates from sorted Vector */
        int [] arr = {2,2,2,3,5,5,6,7,8,8,9};
        removeDuplicates(arr);

        // /* Question 5 --> Two Sum on Sorted Vector */
        // int[] arr = { 2, 7, 11, 14, 30 };
        // int target = 37;
        // int[] result = twoSum(arr, target);
        // for (int j : result) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
    }
}
