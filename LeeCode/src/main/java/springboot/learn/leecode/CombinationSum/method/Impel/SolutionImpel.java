package springboot.learn.leecode.CombinationSum.method.Impel;

import springboot.learn.leecode.CombinationSum.method.Solution;

import java.util.*;

public class SolutionImpel implements Solution {

    /**
     * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
     *
     * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
     *
     * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
     *
     *  
     *
     * Example 1:
     *
     * Input: candidates = [2,3,6,7], target = 7
     * Output: [[2,2,3],[7]]
     * Explanation:
     * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
     * 7 is a candidate, and 7 = 7.
     * These are the only two combinations.
     * Example 2:
     *
     * Input: candidates = [2,3,5], target = 8
     * Output: [[2,2,2,2],[2,3,3],[3,5]]
     * Example 3:
     *
     * Input: candidates = [2], target = 1
     * Output: []
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param candidates
     * @param target
     * @return
     */

//    Set<List<Integer>> result = new HashSet<>();
    List<List<Integer>> result = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    @Override
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        /**
         * 现在好多题都要求：元素唯一，不重复：
         * 应该想到集合数据结构：SET；不然每次处理完，还需要做去重处理
         */
        int length = candidates.length;
        if(length < 1){
            return new ArrayList<>(result);
        }
        Arrays.sort(candidates);
        if(candidates[0] > target){
            return new ArrayList<>(result);
        }
        traceback(candidates,target,0,0);
        return new ArrayList<>(result);
    }
    public void traceback(int[] candidates, int target,int sum,int count){
        if(target < sum){
            return;
        }
        if(sum == target ){
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer integers : path){
                temp.add(integers);
            }
            result.add(temp);
            return;
        }
        int length = candidates.length;
        for(;count < length && sum < target;count++){
           sum +=candidates[count];
           path.add(candidates[count]);
           traceback(candidates,target,sum,count);
           //回溯两个指标：
           sum -=candidates[count];
           path.remove(path.size() - 1);
        }
    }
}
