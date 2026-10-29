import java.util.HashMap;

public class OnlyDsaHashMap_5 {

    // /* Question 2 ---> Two Sum */
    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        // /* Question 2 ---> Two Sum */
        // int[] arr = { 2, 5, 9, 11, 16 };
        // int target = 7;
        // for (int i : twoSum(arr, target)) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // /* Question 1 ---> Frequency Count*/
        // String[] fruit = { "apple","grapes", "banana", "apple", "grapes", "apple" };
        // System.out.println(countFrequency(fruit));

        // /* Question 2 ---> Most Frequent element */

    }
}
