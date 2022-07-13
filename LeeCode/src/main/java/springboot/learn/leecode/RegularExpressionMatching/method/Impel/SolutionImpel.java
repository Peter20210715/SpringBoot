package springboot.learn.leecode.RegularExpressionMatching.method.Impel;

import springboot.learn.leecode.RegularExpressionMatching.method.Solution;

/**
 * <p>Title: SolutionImpel$</p >
 * <p>Description: TODO(用一句句话描述该文件做什么) </p >
 * <p>Copyright: Copyright (c) $</p >
 * <p>Company: inspur </p >
 *
 * @author WangZhongming
 * @version 1.0
 * @createtime $ $
 */

public class SolutionImpel implements Solution {
    /**
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
     *
     * '.' Matches any single character.​​​​
     * '*' Matches zero or more of the preceding element.
     * The matching should cover the entire input string (not partial).
     *
     *  
     *
     * Example 1:
     *
     * Input: s = "aa", p = "a"
     * Output: false
     * Explanation: "a" does not match the entire string "aa".
     * Example 2:
     *
     * Input: s = "aa", p = "a*"
     * Output: true
     * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
     * Example 3:
     *
     * Input: s = "ab", p = ".*"
     * Output: true
     * Explanation: ".*" means "zero or more (*) of any character (.)".
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/regular-expression-matching
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    @Override
    public boolean isMatch(String s, String p) {
        int slen=s.length();
        int plen=p.length();
        if(slen==0 && plen==0) {
            return true;
        }
        //if(slen==0||plen==0)return false;

        boolean[][] dp=new boolean[slen+1][plen+1];
        //dp[i][j]表示s的0到i-1和p的0到j-1是否匹配
        dp[0][0]=true;
        //初始化s=0
        for(int j=1;j<=plen;j++){
            //当s为空时，a*b*c*可以匹配
            //当判断到下标j-1是*，j-2是b，b对应f，要看之前的能否匹配
            //比如a*b*下标依次为ftft，b之前的位t，所以j-1也是true
            //即dp[0][j]对应的下标j-1位true
            if(j==1) {
                dp[0][j] = false;
            }
            if(p.charAt(j-1)=='*'&&dp[0][j-2]){
                dp[0][j]=true;
            }
        }

        //for循环当s长度为1时能否匹配，一直到s长度为slen
        for(int i=1;i<=slen;i++){
            for(int j=1;j<=plen;j++){
                //最简单的两种情况   字符相等或者p的字符是‘.'
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }
                //p当前字符是*时，要判断*前边一个字符和s当前字符

                else if(p.charAt(j-1)=='*'){
                    if(j<2){
                        dp[i][j]=false;
                    }
                    //如果p的*前边字符和s当前字符相等或者p的字符是‘.'
                    //三种可能
                    //匹配0个，比如aa aaa*也就是没有*和*之前的字符也可以匹配上（在你（a*）没来之前我们(aa)已经能匹配上了）dp[i][j]=dp[i][j-2]
                    //匹配1个，比如aab aab* 也就是*和*之前一个字符只匹配s串的当前一个字符就不看*号了  即 dp[i][j]=dp[i][j-1]
                    //匹配多个，比如aabb aab*  b*匹配了bb两个b  那么看aab 和aab*是否能匹配上就行了，即dp[i][j]=dp[i-1][j]
                    if(p.charAt(j-2)==s.charAt(i-1)||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i-1][j]||dp[i][j-1]||dp[i][j-2];
                    }
                    //如果p的*前边字符和s当前字符不相等或者p的字符不是‘.'，那就把*和*前边一个字符都不要了呗
                    //你会发现不管是这种情况还是上边的情况都会有dp[i][j]=dp[i][j-2];所以可以把下边剪枝，不用分开写了
                    //这里分开写是为了好理解
                    else if(p.charAt(j-2)!=s.charAt(i-1)&&p.charAt(j-2)!='.'){
                        dp[i][j]=dp[i][j-2];
                    }
                }
                //其他情况肯定不能匹配上了  直接false  比如 aba abb*c
                else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[slen][plen];
    }

    /**
     * 想法：首先在p中定位s的首字母
     * 然后
     */

}

