package springboot.learn.leecode.CombinationSumII.method.Impel;

import springboot.learn.leecode.CombinationSumII.method.Solution;

import java.util.*;

public class SolutionImpel implements Solution {

    /**
     * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
     *
     * Each number in candidates may only be used once in the combination.
     *
     * Note: The solution set must not contain duplicate combinations.
     *
     *  
     *
     * Example 1:
     *
     * Input: candidates = [10,1,2,7,6,1,5], target = 8
     * Output:
     * [
     * [1,1,6],
     * [1,2,5],
     * [1,7],
     * [2,6]
     * ]
     * Example 2:
     *
     * Input: candidates = [2,5,2,1,2], target = 5
     * Output:
     * [
     * [1,2,2],
     * [5]
     * ]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/combination-sum-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Override
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int length = candidates.length;
        if(length < 1){
            return  result;
        }
        Arrays.sort(candidates);
        if(candidates[0] > target){
            return  result;
        }
        traceBack(candidates,target,0,0);
        return  result;
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public void traceBack(int[] candidates, int target,int sum,int count){
        if(sum > target){
            return;
        }
        if(sum == target){
            List<Integer> temp = new ArrayList<>();
            for(Integer integer:path){
                temp.add(integer);
            }
            result.add(temp);
            return;
        }
        int length = candidates.length;
        for(int i = count;i<length && sum<target;i++){
            if(i > count &&candidates[i] == candidates[i-1]){
                continue;
            }
            sum +=candidates[i];
            path.add(candidates[i]);
            traceBack(candidates,target,sum,i+1);
            sum -=candidates[i];
            path.remove(path.size() -1);
        }
    }
}
