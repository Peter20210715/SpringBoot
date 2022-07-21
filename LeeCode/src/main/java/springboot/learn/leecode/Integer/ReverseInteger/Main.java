package springboot.learn.leecode.Integer.ReverseInteger;

import springboot.learn.leecode.Integer.ReverseInteger.method.Impel.SolutionImpel;

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
     * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
     *
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     *
     *  
     *
     * Example 1:
     *
     * Input: x = 123
     * Output: 321
     * Example 2:
     *
     * Input: x = -123
     * Output: -321
     * Example 3:
     *
     * Input: x = 120
     * Output: 21
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static void main(String[] args) {
        SolutionImpel solutionImpel = new SolutionImpel();
        int x = -123;
        int result = solutionImpel.reverse(x);
        System.out.println(result);
    }
}
