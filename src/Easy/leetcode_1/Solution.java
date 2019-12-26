package Easy.leetcode_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[]{map.get(tmp),i};   //存在即返回
            }
            map.put(nums[i],i);  //不存在，则加入
        }
        throw new RuntimeException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}

