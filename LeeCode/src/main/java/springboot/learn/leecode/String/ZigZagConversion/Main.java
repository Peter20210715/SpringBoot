package springboot.learn.leecode.String.ZigZagConversion;

import springboot.learn.leecode.String.ZigZagConversion.method.Impel.SolutionImpel;

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
     * 这个题：没办法需要多积累：
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
     *
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * Write the code that will take a string and make this conversion given a number of rows:
     *
     * string convert(string s, int numRows);
     *  
     *
     * Example 1:
     *
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     * Example 2:
     *
     * Input: s = "PAYPALISHIRING", numRows = 4
     * Output: "PINALSIGYAHRPI"
     * Explanation:
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     * Example 3:
     *
     * Input: s = "A", numRows = 1
     * Output: "A"
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/zigzag-conversion
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int numRows = 5;
        SolutionImpel solutionImpel = new SolutionImpel();
        String result = solutionImpel.convert(str,numRows);
//        String result = solutionImpel.test(str,numRows);
        System.out.println(result);
    }



}
