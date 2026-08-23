import java.util.Scanner;

public class ArrayDs {

    // /* Question 2 ==> To rotate the array to the right by k positions */
    private static void reverse(int[] arr, int start,int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n - 1);
        reverse(arr,0,k - 1);
        reverse(arr,k, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // /* Question 1 ==> Find the Second largest Distinct element from an array
    public static int secondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if ((arr[i] != max) && (arr[i] > secMax)) {
                secMax = arr[i];
            }
        }
        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // /* Question 1 ==> Find the Second largest Distinct element from an array */
        // int []arr = { 3, 6, 2, 9, 8, 7, 1, 6, 2 };
        // System.out.println("Second largest ==> " + secondLargest(arr));

        // /* Question 2 ==> To rotate the array to the right by k positions */
        System.out.print("Enter the position : ");
        int k = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5 };
        rotateArray(arr, k);

        sc.close();
    }
}