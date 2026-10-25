public class OnlyDsaRecursion_6 {
    // /* Question 4 --> Calculate the power of given base */
    public static int power(int base ,int exp){
        if(exp == 0 ){
            return 1;
        }
        if(exp == 1){
            return base;
        }
        return base * power(base, exp - 1);
    }

    // /* Question 3 --> Reverse a string */
    public static String reverseStr(String str,int n){
        if(n<0){
            return "";
        }
        return str.charAt(n) + reverseStr(str, n-1);
    }

    // /* Question 2 --> Calculate the sum of arrray */
    public static int sumOfArr(int[] arr, int n) {
        if (n < 0) {
            return 0;
        }
        return arr[n] + sumOfArr(arr, n - 1);
    }

    // /* Question 1 --> Calculate factorial of a number */
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // /* Question --> 1 */
        // int n = 0;
        // int result = factorial(n);
        // System.out.println("Factorial of n : " + result);

        // /* Question --> 2 */
        // int [] arr = {1,3,4,2,5};
        // int sum = sumOfArr(arr,arr.length - 1);
        // System.out.println("Sum of Array : "+ sum);

        // // /* Question --> 3 */
        // String str = "popoye";
        // int n = str.length() -1;
        // String newStr = reverseStr(str,n);
        // System.out.println("Reversed String : "+ newStr);

        // /* Question --> 4 */
        // int result = power(2, 1);
        // System.out.println("Power of base : " + result);
    }
}
