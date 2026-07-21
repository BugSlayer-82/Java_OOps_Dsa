import java.util.Scanner;

public class OnlyDsaRecursion_6 {
    // /* Question 4 ==> Print the fibonacci of n */
    static void printFibonacci(int n){
        
    }

    // /* Question 3 ==> Print the factorial of n */
    // static long factorial(int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return n*factorial(n-1);
    // }

    // /* Question 2 ==> Print number from n to 1 */
    // static void printNumber(int n) {
    // if(n == 0){
    // return ;
    // }
    // System.out.print(n + " ");
    // printNumber(n - 1);
    // }

    // /* Questtion 1 ==> Print number from 1 to n */
    // static void printNumber(int i, int n) {
    // if (i > n) {
    // return;
    // }
    // System.out.print(i + " ");
    // printNumber(i + 1, n);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        // /* Questtion 1 ==> Print number from 1 to n */
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
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        printFibonacci(n);

        sc.close();
    }
}
