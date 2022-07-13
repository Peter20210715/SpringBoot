package springboot.learn.leecode.LongestCommonPrefix.method.Impel;

import springboot.learn.leecode.LongestCommonPrefix.method.Solution;

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
     * 动态规划：strs数组，遍历到当前假定为   最后一个字符串
     * 另外写一个：函数，两个参数：字符串 ； 返回一个字符串
     * 函数功能：取出最长公共字符串
     * @param strs
     * @return
     */

    @Override
    public String longestCommonPrefix(String[] strs) {
        /**
         * 这里利用到String类型中在Java中的特性：
         * 虽然为引用类型，但是不允许改变
         */
        String result = "";
        int length = strs.length;
        result = strs[0];
        for(int i = 1; i<length;i++){
            result = longestCommon(result,strs[i]);
        }

        return result;
    }

    /**
     * 另外写一个：函数，两个参数：字符串 ； 返回一个字符串
     * 函数功能：取出最长公共字符串
     */
    public String longestCommon(String str1,String str2){
        StringBuffer temp = new StringBuffer();
        int length1 = str1.length();
        int length2 = str2.length();
        for(int i=0; i< length1 && i< length2; i++){
            if(str1.charAt(i) !=str2.charAt(i)){
                break;
            }else {
                temp.append(str1.charAt(i));
            }
        }

        return temp.toString();
    }
}


