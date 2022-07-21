package springboot.learn.leecode.Array.LongestCommonPrefix;

import springboot.learn.leecode.Array.LongestCommonPrefix.method.Impel.SolutionImpel;

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
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     *  
     *
     * Example 1:
     *
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     *
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/longest-common-prefix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        SolutionImpel solutionImpel = new SolutionImpel();
        String[] strs = {"flower","flow","flight","fuck"};
        String result = solutionImpel.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
