public class BasicAlgo {
    // /* =============> Categories of Array <================  */
    // /* Basic implementation of Prefix Sum Algorithm  [Time & Space O(1) O(n) ] */
    static int [] buildPrefix(int []arr){
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[ i - 1 ] + arr[i];
        }
        return prefix;
    }
    static int rangeSum(int [] prefix, int l,int r){
        if(l == 0){
            return prefix[r];
        }
        return prefix[r]-prefix[l - 1];
    }

    // /* Basic implementation of Kadane's Algorithm (Standard Approach & best approach) [Time O(n)]*/
    static int kadaneStandard(int [] arr){
        int currSum = arr[0];
        int maxSum = arr[0];
        for(int i = 1; i < arr.length; i++){
            currSum = Math.max(currSum, currSum + arr[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }

    // /* Basic implementation of Kadane's Algorithm (Simple Approach) */
    static int kadaneSimple(int[] arr) {
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
        // /* Kadane's through Simple Approach */
        int[] arr1 = { 2,-10,12,-5,6 };
        int result1 = kadaneSimple(arr1);
        System.out.println("Max Sum of simple ==> " + result1);

        // /* Kadane's through Standard Approach */
        int [] arr2 = {2,-10,12,-5,6};
        int result2 = kadaneStandard(arr2);
        System.out.println("Max Sum standard ==> "+ result2);

        // /* Prefix Sum Approach */
        int []arr3 = {8,12,10,2,6,15,7};
        int []prefix = buildPrefix(arr3);
        System.out.println("Prefix sum ==> " + rangeSum(prefix, 0,2));
    }
}
