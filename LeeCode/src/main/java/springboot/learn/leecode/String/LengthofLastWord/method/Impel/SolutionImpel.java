package springboot.learn.leecode.String.LengthofLastWord.method.Impel;

import springboot.learn.leecode.String.LengthofLastWord.method.Solution;

/**
 * <p>Title: </p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) </p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming （换成自己的）
 * @version 1.0
 * @createtime
 */
public class SolutionImpel implements Solution {
    @Override
    public int lengthOfLastWord(String s) {
        /**
         * Given a string s consisting of words and spaces, return the length of the last word in the string.
         *
         * A word is a maximal substring consisting of non-space characters only.
         *
         *  
         *
         * Example 1:
         *
         * Input: s = "Hello World"
         * Output: 5
         * Explanation: The last word is "World" with length 5.
         * Example 2:
         *
         * Input: s = "   fly me   to   the moon  "
         * Output: 4
         * Explanation: The last word is "moon" with length 4.
         * Example 3:
         *
         * Input: s = "luffy is still joyboy"
         * Output: 6
         * Explanation: The last word is "joyboy" with length 6.
         *
         * 来源：力扣（LeetCode）
         * 链接：https://leetcode.cn/problems/length-of-last-word
         * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
         */
        int length = s.length();
        int count = 0;
        for(int i= length - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && i < length - 1 && s.charAt(i+1) != ' '){
                break;
            }
            if(s.charAt(i) == ' '){
                continue;
            }
            count ++;
        }
        return count;
    }
}
