package Easy.leetcode_38;

public class Solution {
    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            char c = str.charAt(0);
            int cnt = 1;
            for (int j = 1; j < str.length(); j++) {
                char cc = str.charAt(j);
                if (c == cc) {
                    cnt++;
                } else {
                    temp.append(cnt).append(c);
                    cnt = 1;
                    c = cc;
                }
            }
            temp.append(cnt).append(c);
            str = temp.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
