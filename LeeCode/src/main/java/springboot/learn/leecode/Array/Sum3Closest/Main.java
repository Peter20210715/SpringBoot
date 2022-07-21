package springboot.learn.leecode.Array.Sum3Closest;

import springboot.learn.leecode.Array.Sum3Closest.method.Impel.SolutionImpel;

public class Main {
    public static void main(String[] args) {
        /**
         * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
         *
         * Return the sum of the three integers.
         *
         * You may assume that each input would have exactly one solution.
         *
         *  
         *
         * Example 1:
         *
         * Input: nums = [-1,2,1,-4], target = 1
         * Output: 2
         * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
         * Example 2:
         *
         * Input: nums = [0,0,0], target = 1
         * Output: 0
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/3sum-closest
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        int[] nums={-1,2,1,-4};
        int target = 2;
        SolutionImpel solutionImpel = new SolutionImpel();
        target = solutionImpel.threeSumClosest(nums,target);
        System.out.println(target);
    }
}
