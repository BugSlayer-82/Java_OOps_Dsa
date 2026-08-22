public class ArrayDs {

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

        // /* Question 1 ==> Find the Second largest Distinct element from an array */
        int arr[] = { 3, 6, 2, 9, 8, 7, 1, 6, 2 };
        System.out.println("Second largest ==> " + secondLargest(arr));
    }
}