package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.SubSet.method.Impel;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.SubSet.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution {
    /**
     * Given an integer array nums of unique elements, return all possible subsets (the power set).
     *
     * The solution set must not contain duplicate subsets. Return the solution in any order.
     *
     *  
     *
     * Example 1:
     *
     * Input: nums = [1,2,3]
     * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     * Example 2:
     *
     * Input: nums = [0]
     * Output: [[],[0]]
     *  
     *
     * Constraints:
     *
     * 1 <= nums.length <= 10
     * -10 <= nums[i] <= 10
     * All the numbers of nums are unique.
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/subsets
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param nums
     * @return
     */
    @Override
    public List<List<Integer>> subsets(int[] nums) {
        return null;
    }
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

}
