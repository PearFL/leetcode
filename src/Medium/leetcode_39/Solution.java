package Medium.leetcode_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, res, 0, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> list){
        if(target < 0) return;
        if(target == 0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int st=i;st<candidates.length;st++){
            list.add(candidates[st]);
            dfs(candidates, target - candidates[st], res, st, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum(candidates, target);
        for (List<Integer> list: ans) {
            for (int i: list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
