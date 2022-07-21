package springboot.learn.leecode.String.StringDP;

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

import springboot.learn.leecode.String.StringDP.method.Solution;
import springboot.learn.leecode.String.StringDP.method.impl.SolutionImp;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *  
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Main {
    public static void main(String[] args) {
        String str = "1234567890";
        Solution solution = new SolutionImp();
        int result ;
        result = solution.lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
