import java.util.HashMap;

public class LeetCode_3 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            char ch[] = s.toCharArray();
            int left = 0, maxLen = 0;
            for (int right = 0; right < s.length(); right++) {
                if (map.containsKey(ch[right])) {
                    left = Math.max(left, map.get(ch[right]) + 1);
                }
                map.put(ch[right],right);
                maxLen = Math.max(maxLen, right - left + 1);
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcabcbb";
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
