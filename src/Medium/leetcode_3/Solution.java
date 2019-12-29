package Medium.leetcode_3;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int l = 0, sLength = s.length();
        int [] dp = new int[sLength + 1];
        for(int i=0;i<sLength;i++){
            if(s.substring(l, i).indexOf(s.charAt(i)) != -1)
                l = s.indexOf(s.charAt(i), l) + 1;
            dp[i + 1] = Math.max(dp[i], i-(l-1));
        }
        return dp[sLength];
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
}
