public class OnlyDsaTwoPointer_8 {

    // /* Question 4 ---> Merge Two Sorted array */
    public static void mergeArray(int[] arr_1, int[] arr_2) {
        int n = arr_1.length + arr_2.length;
        int[] arr = new int[n];
        int x = 0,y = 0,z = 0;
 
        while(z != n){
            if(arr_1[x]< arr_2[y]){
                arr[z] = arr_1[x];
                // z++; 
                x++;
            }else if(arr_1[x]>arr_2[y]){
                arr[z] = arr_2[y];
                // z++;
                y++;
            }
            z++;
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // /* Question 3 ---> String is Palindrome */
    public static boolean isPalindrome(String str) {
        if (str == null) { // Edge case if string is empty
            return false;
        }
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // /* Question 2 ---> Move all zeroes at the end */
    public static void moveZeros(int[] arr) {
        int low = 0, high = 0;
        while (high != arr.length) {
            if (arr[high] != 0) {
                arr[low] = arr[high];
                low++;
            }
            high++;
        }
        for (int i = low; i < high; i++) {
            arr[i] = 0;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // /* Question 1 ---> TwoSum on Sorted Array */
    public static int[] twoSum(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum == target) {
                return new int[] { low, high };
            } else if (sum < target) {
                low++;
            } else {
                high--;
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        // /* Question 1 ---> TwoSum on Sorted Array */
        // int[] arr = { 2, 5, 7, 11, 13 };
        // int target = 10;
        // int[] result = twoSum(arr, target);
        // for (int x : result) {
        // System.out.print(x + " ");
        // }
        // System.out.println();

        // /* Question 2 ---> Move all zeroes at the end */
        // int[] arr = { 4, 0, 2, 0, 1, 0, 0, 5, 9, 0, 7, 8 };
        // moveZeros(arr);

        // /* Question 3 ---> String is Palindrome */
        // String str = "lol";
        // System.out.println("String is Palindrome : "+ isPalindrome(str));

        // /* Question 4 ---> Merge Two Sorted array */
        int[] arr_1 = { 1, 3, 5, 7 };
        int[] arr_2 = { 2, 4, 6, 8 };
        mergeArray(arr_1, arr_2);

    }
}
