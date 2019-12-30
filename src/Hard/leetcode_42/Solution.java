package Hard.leetcode_42;



public class Solution {
    public static int trap(int[] height) {
        int length = height.length;
        if(length == 0) return 0;
        int [] l = new int[length];
        int [] r = new int[length];
        l[0] = height[0];
        for(int i=1;i<length;i++){
            l[i] = Math.max(height[i], l[i - 1]);
        }
        r[length - 1] = height[length - 1];
        for(int i=length-2;i>=0;i--){
            r[i] = Math.max(height[i], r[i + 1]);
        }
        int cnt = 0;
        for(int i=0;i<length;i++){
            cnt = cnt + Math.min(l[i], r[i]) - height[i];
        }
        return cnt;
    }

    public static void main(String[] args) {
        int [] height = {};
        System.out.println(trap(height));
    }
}
