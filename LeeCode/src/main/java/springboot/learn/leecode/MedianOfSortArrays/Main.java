package springboot.learn.leecode.MedianOfSortArrays;

import springboot.learn.leecode.MedianOfSortArrays.method.Impel.SolutionImpel;

/**
 * <p>Title: Main$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class Main {
    public static void main(String[] args) {

        /**
         * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
         * The overall run time complexity should be O(log (m+n)).
         * Example 1:
         *
         * Input: nums1 = [1,3], nums2 = [2]
         * Output: 2.00000
         * Explanation: merged array = [1,2,3] and median is 2.
         * Example 2:
         *
         * Input: nums1 = [1,2], nums2 = [3,4]
         * Output: 2.50000
         * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/median-of-two-sorted-arrays
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};
        double result;
        SolutionImpel solutionImpel  = new SolutionImpel();
        result = solutionImpel.findMedianSortedArrays(nums1,nums2);
        System.out.println(result);
    }
}
