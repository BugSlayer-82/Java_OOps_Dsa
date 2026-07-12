public class BasicAlgo {
    // /* Basic implementation of Kadane's Algorithm */
    static int kadanes(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 4, -2, 3, -10, 5 };
        int result = kadanes(arr);
        System.out.println("Max Sum --> " + result);

    }
}
