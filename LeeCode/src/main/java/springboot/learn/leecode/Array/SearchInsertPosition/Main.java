package springboot.learn.leecode.Array.SearchInsertPosition;

import springboot.learn.leecode.Array.SearchInsertPosition.method.Impel.SolutionImpel;

/**
 * <p>Title: Main</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) </p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming （换成自己的）
 * @version 1.0
 * @date 2022-07-19 18:52:42
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Example 1:
         *
         * Input: nums = [1,3,5,6], target = 5
         * Output: 2
         * Example 2:
         *
         * Input: nums = [1,3,5,6], target = 2
         * Output: 1
         * Example 3:
         *
         * Input: nums = [1,3,5,6], target = 7
         * Output: 4
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/search-insert-position
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        int[] nums = {1,3,5,6};
        int target = 2;
        SolutionImpel solutionImpel = new SolutionImpel();
        int result = solutionImpel.searchInsert(nums,target);
        System.out.println(result);
    }
}
