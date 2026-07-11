import java.util.HashMap;

// /* Question 1 ---> Two Sum Problem */
class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int[] twoSum(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[] { map.get(temp), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }
}

public class LeetCode_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 7, 11, 15, 10 };
        int target = 17;
        int[] result = sol.twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}