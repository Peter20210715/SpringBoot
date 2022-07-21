package springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PalindromePartitioning.method.Impel;

import springboot.learn.leecode.AlgorithmUnidirectionalBacktrace.Partition.PalindromePartitioning.method.Solution;

import java.util.ArrayList;
import java.util.List;

public class SolutionImpel implements Solution {
    @Override
    public List<List<String>> partition(String s) {
        if(s.length() < 1){
            return result;
        }else if(s.length() == 1){
            temp.add(s);
            result.add(temp);
            return result;
        }else {
            traceBack(s,0);

            return result;
        }

    }
    List<List<String>> result = new ArrayList<>();
    List<String> temp = new ArrayList<>();

    /**
     * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
     *
     * A palindrome string is a string that reads the same backward as forward.
     *
     *  
     *
     * Example 1:
     *
     * Input: s = "aab"
     * Output: [["a","a","b"],["aa","b"]]
     * Example 2:
     *
     * Input: s = "a"
     * Output: [["a"]]
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/palindrome-partitioning
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 写一个判断字符串是否为回文字符串函数：返回值 Boolean   参数 String
     * 双指针 遍历判断
     */
    boolean isPalindrome(String str){
        boolean flag = true;
        int length = str.length();
        int front,rear;
        front = 0;
        rear = length - 1;
        while (front < rear){
            if(str.charAt(front) != str.charAt(rear)){
                flag = false;
                break;
            }
            front++;
            rear--;
        }

        return flag;
    }
    /**
     * 写一个回溯函数：参数 (原始字符串 S,本次回溯遍历字符串 temp,本次回溯的起始点 count)
     * 这里注意看到 temp 元素组成；学习本次拆分终止条件：[["a","a","b"],["aa","b"]]
     *
     */
    void traceBack(String s,int count){
        int length = s.length();
        if(count >= length && !temp.isEmpty()){
            List<String> temp_one = new ArrayList<>();
            for(String s1:temp){
                temp_one.add(s1);
            }
            result.add(temp_one);
            return;
        }
        for(int i= count;i< length;i++){
            String str = s.substring(count,i+1);
            if(isPalindrome(str)){
                temp.add(str);
            }else {
                continue;
            }
            traceBack(s,i+1);
            temp.remove(temp.size() - 1);
        }
    }
}
