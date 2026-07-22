import java.util.Scanner;

public class OnlyDsaRecursion_6 {
    // /* Question 5 ==> Print the power a^b */
    static int power(int base,int power){
        
        return 0;
    }

    // /* Question 4 ==> Print the fibonacci of n */
    // static int printFibonacci(int n) {
    //     if (n == 0) {
    //         return 0;
    //     }
    //     if (n == 1) {
    //         return 1;
    //     }
    //     return printFibonacci(n - 1) + printFibonacci(n - 2);
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
        Scanner sc = new Scanner(System.in);

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
        //     System.out.print(printFibonacci(i) + " ");
        // }
        // System.out.println();

        sc.close();
    }
}
