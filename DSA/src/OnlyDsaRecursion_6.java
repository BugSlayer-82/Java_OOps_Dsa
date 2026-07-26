// import java.util.Scanner;

public class OnlyDsaRecursion_6 {
    // /* Question 10 ==> Tower of Hanoi */
    // static void towerOfHanoi(int n, char src, char helper, char dest) {
    // if (n == 1) {
    // System.out.println("Move disk : 1 from Source : "
    // + src + " to Dest : " + dest);
    // return;
    // }
    // towerOfHanoi(n - 1, src, dest, helper);
    // System.out.println("Move disk : " + n + " from Source : "
    // + src + " to Dest : " + dest);
    // towerOfHanoi(n - 1, helper, src, dest);
    // }

    // /* Question 9 ==> Recursive Binary Search */
    // static boolean binarySearch(int[] arr, int x, int low, int high) {
    // if (low > high) {
    // return false;
    // }
    // int mid = low + (high - low) / 2;
    // if (arr[mid] == x) {
    // return true;
    // } else if (arr[mid] > x) {
    // high = mid - 1;
    // } else {
    // low = mid + 1;
    // }
    // return binarySearch(arr, x, low, high);
    // }

    // /* Question 8 ==> Palindrome Check */
    // static int isPalindrome(int num, int reverse) {
    // if (num == 0) {
    // return reverse;
    // }
    // reverse = reverse * 10 + (num % 10);
    // return isPalindrome(num / 10, reverse);
    // }

    // /* Question 7 ==> Reverse String */
    // static void reverseString(String str) {
    // int n = str.length();
    // if (str == null || n <= 0) {
    // return;
    // }
    // reverseString(str.substring(1));
    // System.out.print(str.charAt(0));
    // }

    // /* Question 6 ==> Print the sum of digits */
    // static int sumOfDigit(int num) {
    // if (num == 0) {
    // return 0;
    // }
    // return (num % 10) + sumOfDigit(num / 10);
    // }

    // /* Question 5 ==> Print the power a^b */
    // static int power(int base, int power) {
    // if(power == 0){
    // return 1;
    // }
    // return base*power(base,power - 1);
    // }

    // /* Question 4 ==> Print the fibonacci of n */
    // static int printFibonacci(int n) {
    // if (n == 0) {
    // return 0;
    // }
    // if (n == 1) {
    // return 1;
    // }
    // return printFibonacci(n - 1) + printFibonacci(n - 2);
    // }

    // /* Question 3 ==> Print the factorial of n */
    // static long factorial(int n){
    // if(n == 0){
    // return 1;
    // }
    // return n*factorial(n-1);
    // }

    // /* Question 2 ==> Print number from n to 1 */
    // static void printNumber(int n) {
    // if(n == 0){
    // return ;
    // }
    // System.out.print(n + " ");
    // printNumber(n - 1);
    // }

    // /* Question 1 ==> Print number from 1 to n */
    // static void printNumber(int i, int n) {
    // if (i > n) {
    // return;
    // }
    // System.out.print(i + " ");
    // printNumber(i + 1, n);
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // /* Question 1 ==> Print number from 1 to n */
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // printNumber(1, n);
        // System.out.println();

        // /* Question 2 ==> Print number from n to 1 */
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // printNumber(n);
        // System.out.println();

        // /* Question 3 ==> Print the factorial of n */
        // System.out.print("Enter your number : ");
        // int n = sc.nextInt();
        // long result = factorial(n);
        // System.out.println("Factorial of n : " + result);

        // /* Question 4 ==> Print the fibonacci of n */
        // System.out.print("Enter your number of terms: ");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // System.out.print(printFibonacci(i) + " ");
        // }
        // System.out.println();

        // /* Question 5 ==> Print the power a^b */
        // System.out.println("Enter your base and their power ?");
        // int base = sc.nextInt();
        // int power = sc.nextInt();
        // int result = power(base, power);
        // System.out.println("Final power is : "+result);

        // /* Question 6 ==> Print the sum of digits */
        // System.out.print("Enter your number : ");
        // int num = sc.nextInt();
        // int sum = sumOfDigit(num);
        // System.out.println("Total Sum : " + sum);

        // /* Question 7 ==> Reverse String */
        // String str = "Macbook-Pro";
        // reverseString(str);
        // System.out.println();

        // /* Question 8 ==> Palindrome check */
        // System.out.print("Enter your number to check is Plindrome : ");
        // int num = sc.nextInt();
        // int result = isPalindrome(num, 0);
        // if (num != result) {
        // System.out.println("Number is not Palindrome");
        // } else {
        // System.out.println("Number is Palindrome .");
        // }

        // /* Question 9 ==> Recursive Binary Search */
        // int[] arr = { 2, 3, 5, 6, 8, 9, 20 };
        // System.out.print("Enter your number you want : ");
        // int x = sc.nextInt();
        // boolean isFound = binarySearch(arr, x, 0, arr.length - 1);
        // if (!isFound) {
        // System.out.println("X Element is not found !");
        // } else {
        // System.out.println("X Element is found ..");
        // }

        // /* Question 10 ==> Tower of Hanoi */
        // System.out.print("Enter number of plates in a tower : ");
        // int n = sc.nextInt();
        // towerOfHanoi(n, 'A', 'B', 'C');

        // sc.close();
    }
}
