package springboot.learn.leecode.PalindromicSubstring;


import    springboot.learn.leecode.PalindromicSubstring.method.Impel.SolutionImpel;

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
     * Given a string s, return the longest palindromic substring in s.
     *
     *  
     *
     * Example 1:
     *
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     *
     * Input: s = "cbbd"
     * Output: "bb"
     *  
     *
     * Constraints:
     *
     * 1 <= s.length <= 1000
     * s consist of only digits and English letters.
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/longest-palindromic-substring
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String str = "babad";
        SolutionImpel solutionImpel = new SolutionImpel();
        String result;
        result = solutionImpel.longestPalindrome(str);
        System.out.println(result);

    }
}
