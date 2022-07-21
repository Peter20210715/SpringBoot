package springboot.learn.leecode.String.PalindromicSubstring.method.Impel;

import springboot.learn.leecode.String.PalindromicSubstring.method.Solution;

import java.util.ArrayList;
import java.util.List;

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
    @Override
    public String longestPalindrome(String s) {
        /**
         * 1.暂时的想法：和最长不重复字串一致
         *  a.动态规划
         *
         */
        if(s.length() < 1){
            //排除非空情况
            return s;
        }
        ArrayList<Character> result = new ArrayList<>();
        result.add(s.charAt(0));
        int length = s.length();
        int start,end;
        int cur;
        start = end = 0;
        for(int i = 1; i < length; i++){
            Character ch = s.charAt(i);
            result.add(ch);
            cur = longest(result);
            if(cur > end - start + 1){
                end = i;
                start = end - cur + 1;
            }
        }



        return s.substring(start,start+(end - start + 1));
    }

    /**
     *     该函数用于求解出当前字符串最长的palindromic字符串
     *     最后一个字符必须要纳入管理
     *     注意start,end 的复位要求
     */
    public  int longest(List<Character> list){
        int length = list.size();
        int start,end;
        int count = 0;
        end = length - 1;
        start = 0;
        while(start <= end){
            if(!list.get(start).equals(list.get(end)) ){
                if(end == length - 1){
                    start ++;
                }else {
                    //start   复位 aaaabaaa
                    start = start - count/2 + 1;
                    end = length - 1;
                }
                count = 0;
            }else {
                if(end == start){
                    count +=1;
                }else {
                    count += 2;
                }
                start++;
                end--;
            }
        }
        return count;
    }
}
