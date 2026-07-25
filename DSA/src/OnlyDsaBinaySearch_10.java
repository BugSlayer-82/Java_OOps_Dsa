import java.util.Scanner;
import java.util.Vector;

public class OnlyDsaBinaySearch_10 {
    static int binaySearch(int[] arr, int x) {
        Vector<Integer> list = new Vector<>();
        for (int i : arr) {
            list.add(i);
        }
        int low = 0;
        int high = list.size() - 1;
        while (low <= high) {
            int mid = (high - low) + low / 2;
            int curr = list.get(mid);
            if (curr == x) {
                return mid;
            } else if (curr > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // /* Question 1 --> Implement Binary Search */
        int[] arr = { 2, 3, 5, 7, 9, 10, 15, 20 };
        System.out.print("Enter your number do you want : ");
        int x = sc.nextInt();
        int result = binaySearch(arr, x);
        if (result == -1) {
            System.out.println("X is not Found");
        } else {
            System.out.println("X is found at : " + result);
        }

        sc.close();
    }
}
